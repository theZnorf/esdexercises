/*----------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------*/
/*-----------------Simplistic PPM format I/O library--------------------------*/
/*-----------------for educational purposes-----------------------------------*/
/*----------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------*/
/*-----(C) Andreas Wasserbauer------------------------------------------------*/
/*----------------------------------------------------------------------------*/

#include "simpleppm.h"


/*get token from a single line string (only one \n allowed)*/
int get_token(char* str, int* val, int* pos){
  int i,j;
 
  i=*pos;

  /*is it a comment line?*/ 
  if (str[i] == '#') return 0;
  
  /*skip over blanks*/
  while(isblank(str[i]) || str[i]==10) {
   if (str[i]==13 || str[i]==10) return 0;
   i++;
  }

  /*did we reach the end?*/
  if (str[i]==0) return 0;
  /*found magic number?*/ 
  if (str[i] == 'P' && str[i+1]=='6') return 1; 
  j=i;
  /*we expect a number here*/
  while(isdigit(str[i])) i++;
  /*is it delimited with a blank?*/
  if ( !isblank(str[i] ) && str[i]!=10 ) {return -1;}
  *val = atoi(&(str[j]));
  *pos = i;
  return 2;
}


int PPM_load(RGB* ppm, char* filename){
  FILE* file;
  char str[1024];
  int bpp;
  int token_type,token_val, str_pos;
  size_t bytes_read;
  int bufsize;

  /*read header*/ 
  file=fopen(filename,"rb");
  if (file==NULL) return 1;

  fgets(str,1024,file);
  str_pos=0;
  token_type = get_token(str, &token_val, &str_pos);
  while (!token_type){
    fgets(str,1024,file);
    str_pos=0;
    token_type = get_token(str, &token_val, &str_pos);
  }
  
  /*magic number found?*/
  if (token_type != 1) {return 2;} 

  str_pos=2; 
  token_type = get_token(str, &token_val, &str_pos);
  while (!token_type){
    fgets(str,1024,file);
    str_pos=0;
    token_type = get_token(str, &token_val, &str_pos);
  }
  /*number found?*/
  if (token_type != 2) {

   return 3;
} 
  ppm->width=token_val; 

  token_type = get_token(str, &token_val, &str_pos);
  while (!token_type){
    fgets(str,1024,file);
    str_pos=0;
    token_type = get_token(str, &token_val, &str_pos);
  }
  
  if (token_type != 2) return 3; 
  ppm->height=token_val; 
  token_type = get_token(str, &token_val, &str_pos);
  while (!token_type){
    fgets(str,1024,file);
    str_pos=0;
    token_type = get_token(str, &token_val, &str_pos);
  }
  
  if (token_type != 2) return 3; 
  ppm->maxcol=token_val; 
 
  /*now check for mandatory whitespace to delimit data from header*/
  if (!isblank(str[str_pos]) && !(str[str_pos]==10)) return 4;

  /*now get the data*/
  bpp=(ppm->maxcol<256)?1:2;
  bufsize=bpp*ppm->width*ppm->height*3;
  ppm->data=malloc(bufsize*sizeof(char));
  bytes_read=fread(ppm->data, sizeof(char), bufsize, file);
   
  if (bytes_read < bufsize) return 3;

  fclose(file);
  
  return 0;
}

int PPM_save(RGB* ppm, char* filename){
  
  FILE* file;
  size_t bytes_written;
  int bpp,bufsize;
  
  file=fopen(filename,"wb");
   
  fprintf(file,"P6\n#CREATED BY SIMPLEPPM\n %d %d\n%d\n",ppm->width,ppm->height,ppm->maxcol);
  
  bpp=(ppm->maxcol<256)?1:2;
  bufsize=bpp*ppm->width*ppm->height*3;
  bytes_written=fwrite(ppm->data,sizeof(char), bufsize  ,file); 

  if (bytes_written < bufsize) return 3;
  fclose(file);

  return 0;
}
