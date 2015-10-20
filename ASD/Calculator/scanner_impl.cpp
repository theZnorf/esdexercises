//       $Id: scanner.cpp 2920 2006-11-30 18:10:30Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/src/scanner.cpp $
// $Revision: 2920 $
//     $Date: 2006-11-30 19:10:30 +0100 (Do, 30 Nov 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $
//
//   Remarks: rearrange the methods according to the header file

#include "scanner_impl.h"

#include <cassert>
#include <sstream>
#include <cstring>

using std::istream;
using std::ostringstream;
using std::string;
using std::strlen;

bool scanner_impl::is_alpha (char const c) {
   return (isalpha (c) != 0) || (c == '_');
}

bool scanner_impl::is_alphanum (char const c) {
   return is_alpha (c) || (isdigit (c) != 0);
}

bool scanner_impl::is_whitespace (char const c) {
   return isspace (c) != 0;
}

scanner_impl::scanner_impl (istream * const pin) {
   m_buffer = new char [c_size]; assert (m_buffer != 0);
   m_pin    = pin;

   on_new_istream ();
}

scanner_impl::~scanner_impl () {
   delete [] m_buffer;
}

size_t scanner_impl::add_keyword (string const & keyword, int const code) {
   m_keywords[keyword] = static_cast <symbol_type> (symbol::ts_user + code);

   if ((m_symbol.get_type () == symbol::tc_identifier) && (m_symbol.get_string () == keyword)) {
      morph_identifier (keyword);
   }

   return m_keywords.size ();
}

bool scanner_impl::eof () const {
   return m_symbol.eof ();
}

int const & scanner_impl::get_integer () const {
   return m_symbol.get_integer ();
}

istream * scanner_impl::get_istream () const {
   return m_pin;
}

scanner_impl::position_type scanner_impl::get_position () const {
   position_type p = (m_pos_t.first <= 0) ? m_pos_t_p : m_pos_t; p.first -= m_symbol.get_length_int (); return p;
}

double const & scanner_impl::get_real () const {
   return m_symbol.get_real ();
}

string const & scanner_impl::get_string () const {
   return m_symbol.get_string ();
}

symbol const & scanner_impl::get_symbol () const {
   return m_symbol;
}

symbol const & scanner_impl::next_symbol () {
   m_symbol = symbol (); bool scanned = false;

   while (!scanned) {
      if (is_alpha (m_chr)) {
         scan_identifier (); scanned = true;

      } else if (isdigit (m_chr)) {
         scan_number (+1, 0); scanned = true;

      } else if (m_chr == '"') {
         next_char (); scan_string (); scanned = true;

      } else if (m_chr == '+') {
         m_symbol = symbol (symbol::ts_plus, 1, "+"); next_char ();

         if (isdigit (m_chr)) {
            scan_number (+1, 1);
         }

         scanned = true;

      } else if (m_chr == '-') {
         m_symbol = symbol (symbol::ts_minus, 1, "-"); next_char ();

         if (isdigit (m_chr)) {
            scan_number (-1, 1);
         }

         scanned = true;

      } else if (m_chr == '/') {
         m_symbol = symbol (symbol::ts_division, 1, "/"); next_char ();

         if (m_chr == '/') {
            next_char (); scan_comment_sl ();

         } else if (m_chr == '*') {
            next_char (); scan_comment_ml ();

         } else {
            scanned = true;
         }

      } else if (m_chr == '\0') {
         scanned = true;

      } else {
         switch (m_chr) {
            case '(': m_symbol = symbol (symbol::ts_lpar,      1, "("); scanned = true; break;
            case ')': m_symbol = symbol (symbol::ts_rpar,      1, ")"); scanned = true; break;
            case '*': m_symbol = symbol (symbol::ts_multiply,  1, "*"); scanned = true; break;
            case ',': m_symbol = symbol (symbol::ts_comma,     1, ","); scanned = true; break;
            case '.': m_symbol = symbol (symbol::ts_period,    1, "."); scanned = true; break;
            case ':': m_symbol = symbol (symbol::ts_colon,     1, ":"); scanned = true; break;
            case ';': m_symbol = symbol (symbol::ts_semicolon, 1, ";"); scanned = true; break;
            case '=': m_symbol = symbol (symbol::ts_assign,    1, "="); scanned = true; break;
            case '^': m_symbol = symbol (symbol::ts_power,     1, "^"); scanned = true; break;
         }

         next_char ();
      }
   }

   return m_symbol;
}

void scanner_impl::remove_all_keywords () {
   m_keywords.clear ();
}

size_t scanner_impl::remove_keyword (string const & keyword) {
   m_keywords.erase (keyword); return m_keywords.size ();
}

void scanner_impl::set_istream (istream * const pin) {
   m_pin = pin; on_new_istream ();
}

string scanner_impl::symbol_as_string () const {
   return m_symbol.as_string ();
}

bool scanner_impl::symbol_is_assign () const {
   return m_symbol.is_assign ();
}

bool scanner_impl::symbol_is_colon () const {
   return m_symbol.is_colon ();
}

bool scanner_impl::symbol_is_comma () const {
   return m_symbol.is_comma ();
}

bool scanner_impl::symbol_is_division () const {
   return m_symbol.is_division ();
}

bool scanner_impl::symbol_is_eof () const {
   return m_symbol.is_eof ();
}

bool scanner_impl::symbol_is_identifier () const {
   return m_symbol.is_identifier ();
}

bool scanner_impl::symbol_is_integer () const {
   return m_symbol.is_integer ();
}

bool scanner_impl::symbol_is_keyword (int const code) const {
   return m_symbol.is_keyword (code);
}

bool scanner_impl::symbol_is_keyword (string const & keyword) const {
   return m_symbol.is_keyword (keyword);
}

bool scanner_impl::symbol_is_lpar () const {
   return m_symbol.is_lpar ();
}

bool scanner_impl::symbol_is_minus () const {
   return m_symbol.is_minus ();
}

bool scanner_impl::symbol_is_multiply () const {
   return m_symbol.is_multiply ();
}

bool scanner_impl::symbol_is_number () const {
   return m_symbol.is_number ();
}

bool scanner_impl::symbol_is_period () const {
   return m_symbol.is_period ();
}

bool scanner_impl::symbol_is_plus () const {
   return m_symbol.is_plus ();
}

bool scanner_impl::symbol_is_power () const {
   return m_symbol.is_power ();
}

bool scanner_impl::symbol_is_real () const {
   return m_symbol.is_real ();
}

bool scanner_impl::symbol_is_rpar () const {
   return m_symbol.is_rpar ();
}

bool scanner_impl::symbol_is_semicolon () const {
   return m_symbol.is_semicolon ();
}

bool scanner_impl::symbol_is_string () const {
   return m_symbol.is_string ();
}

bool scanner_impl::symbol_is_value () const {
   return m_symbol.is_value ();
}

scanner_impl::operator double () const {
   return m_symbol.operator double ();
}

scanner_impl::operator int () const {
   return m_symbol.operator int ();
}

scanner_impl::operator position_type () const {
   return get_position ();
}

scanner_impl::operator istream * () const {
   return m_pin;
}

scanner_impl::operator string () const {
   return m_symbol.operator string ();
}

scanner_impl::operator symbol () const {
   return m_symbol;
}

void scanner_impl::morph_identifier (string const & keyword) {
   m_symbol = symbol (to_type (keyword), m_symbol.get_length (), m_symbol.get_string (), m_symbol.get_integer (), m_symbol.get_real ());
}

void scanner_impl::next_char () {
   if ((m_pin != 0) && m_pin->good () && (m_pos >= m_length)) {
      m_pin->get (m_buffer, c_size, 0);

      m_length = strlen (m_buffer);
      m_pos    = 0;
   }

   if (m_pos < m_length) {
      m_chr     = m_buffer[m_pos++];
      m_pos_t_p = m_pos_t;

      if (m_chr == '\n') {
         m_pos_t.first    = 0;
         m_pos_t.second  += 1;
         m_pos_t_p.first += 1;
      } else {
         m_pos_t.first += 1;
      }
   } else {
      m_chr = '\0';
   }
}

void scanner_impl::on_new_istream () {
  *m_buffer  = 0;
   m_length  = 0;
   m_pos     = 0;
   m_pos_t   = position_type (0, 1);
   m_pos_t_p = position_type (0, 0);

   next_char   ();
   next_symbol ();
}

void scanner_impl::scan_comment_ml () {
   size_t scanned = 0;

   while (scanned < 2) {
      if (m_chr == '\0') {
         scanned = 2;

      } else if (m_chr == '*') {
         scanned = (scanned == 0) ? 1 : 0;

      } else if (m_chr == '/') {
         scanned = (scanned == 1) ? 2 : 0;

      } else {
         scanned = 0;
      }

      next_char ();
   }
}

void scanner_impl::scan_comment_sl () {
   while ((m_chr != '\n') && (m_chr != '\0')) {
      next_char ();
   }

   next_char ();
}

void scanner_impl::scan_identifier () {
   string value;

   while (is_alphanum (m_chr)) {
      value += m_chr; next_char ();
   }

   m_symbol = symbol (to_type (value), value.size (), value);
}

void scanner_impl::scan_number (int const sign, size_t const sign_length) {
   int    vorkomma        = 0;
   size_t vorkomma_length = sign_length;

   while (isdigit (m_chr)) {
      vorkomma         = vorkomma * 10 + (m_chr - '0');
      vorkomma_length += 1;

      next_char ();
   }

   if (m_chr == '.') {
      next_char ();

      double exponent         = 1;
      int    nachkomma        = 0;
      size_t nachkomma_length = 1;

      while (isdigit (m_chr)) {
         nachkomma         = nachkomma * 10 + (m_chr - '0');
         nachkomma_length +=  1;
         exponent         /= 10;

         next_char ();
      }

      ostringstream o;
      double const  v = sign * (vorkomma + exponent * nachkomma); o << v;

      m_symbol = symbol (symbol::tc_real, vorkomma_length + nachkomma_length, o.str (), static_cast <int> (v), v);
   } else {
      ostringstream o;
      int const     v = sign * vorkomma; o << v;

      m_symbol = symbol (symbol::tc_integer, vorkomma_length, o.str (), v, v);
   }
}

void scanner_impl::scan_string () {
   string value;

   while ((m_chr != '"') && (m_chr != '\n') && (m_chr != '\0')) {
      value += m_chr; next_char ();
   }

   m_symbol = symbol (symbol::tc_string, value.size () + 2, value); next_char ();
}

scanner_impl::symbol_type scanner_impl::to_type (string const & name) const {
   keyword_itor const p = m_keywords.find (name); return (p != m_keywords.end ()) ? p->second : symbol::tc_identifier;
}
