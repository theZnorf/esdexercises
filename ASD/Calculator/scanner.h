//       $Id: scanner.h 3053 2006-12-09 13:07:29Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/trunk/src/scanner.h $
// $Revision: 3053 $
//     $Date: 2006-12-09 14:07:29 +0100 (Sa, 09 Dez 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $

#if !defined SCANNER_H
#define      SCANNER_H

#include "symbol.h"

class scanner {
   public:
      typedef std::pair <int, int> position_type;

      scanner ();
      scanner (std::istream & in);   // implicit conversions allowed
     ~scanner ();

      std::istream * get_istream () const;
      void           set_istream ();
      void           set_istream (std::istream & in);

      size_t add_keyword         (std::string const & keyword, int const code);
      void   remove_all_keywords ();
      size_t remove_keyword      (std::string const & keyword);

      bool                eof              () const;
      int const &         get_integer      () const;
      position_type       get_position     () const;
      double const &      get_real         () const;
      std::string const & get_string       () const;
      symbol const &      get_symbol       () const;
      symbol const &      next_symbol      ();
      std::string         symbol_as_string () const;

      bool symbol_is_assign     () const;
      bool symbol_is_colon      () const;
      bool symbol_is_comma      () const;
      bool symbol_is_division   () const;
      bool symbol_is_eof        () const;
      bool symbol_is_identifier () const;
      bool symbol_is_integer    () const;
      bool symbol_is_keyword    (int const code) const;
      bool symbol_is_keyword    (std::string const & keyword) const;
      bool symbol_is_lpar       () const;
      bool symbol_is_minus      () const;
      bool symbol_is_multiply   () const;
      bool symbol_is_number     () const;
      bool symbol_is_period     () const;
      bool symbol_is_plus       () const;
      bool symbol_is_power      () const;
      bool symbol_is_real       () const;
      bool symbol_is_rpar       () const;
      bool symbol_is_semicolon  () const;
      bool symbol_is_string     () const;
      bool symbol_is_value      () const;

      operator double         () const;
      operator int            () const;
      operator position_type  () const;
      operator std::istream * () const;
      operator std::string    () const;
      operator symbol         () const;

   private:
                scanner    (scanner const &);
      scanner & operator = (scanner const &);

      scanner_impl * m_pimpl;
};

#endif   // SCANNER_H
