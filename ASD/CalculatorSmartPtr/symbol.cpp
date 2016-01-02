//       $Id: symbol.h 2924 2006-11-30 21:11:23Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/src/symbol.h $
// $Revision: 2924 $
//     $Date: 2006-11-30 22:11:23 +0100 (Do, 30 Nov 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $

#include "symbol.h"

#include <sstream>

using std::dec;
using std::hex;
using std::ostringstream;
using std::string;

symbol::symbol (symbol_type const & type, size_t const length, string const & str, int const integer, double const real) {
   m_integer = integer;
   m_length  = length;
   m_real    = real;
   m_string  = str;
   m_type    = type;
}

symbol::~symbol () {
}

string symbol::as_string () const {
   ostringstream o;

   switch (m_type) {
      case tc_identifier: o << "identifier";  break;
      case tc_integer:    o << "integer";     break;
      case tc_real:       o << "real";        break;
      case tc_string:     o << "string";      break;
      case ts_assign:     o << "assign";      break;
      case ts_colon:      o << "colon";       break;
      case ts_comma:      o << "comma";       break;
      case ts_division:   o << "division";    break;
      case ts_eof:        o << "eof";         break;
      case ts_lpar:       o << "lpar";        break;
      case ts_minus:      o << "minus";       break;
      case ts_multiply:   o << "multiply";    break;
      case ts_period:     o << "period";      break;
      case ts_plus:       o << "plus";        break;
      case ts_power:      o << "power";       break;
      case ts_rpar:       o << "rpar";        break;
      case ts_semicolon:  o << "semicolon";   break;
      default:            o << "userdefined"; break;
   }

   o << " (0x" << hex << m_type << ", " << dec << m_length << ", '" << m_string << "')"; return o.str ();
}

bool symbol::eof () const {
   return is_eof ();
}

int const & symbol::get_integer () const {
   return m_integer;
}

size_t const & symbol::get_length () const {
   return m_length;
}

int symbol::get_length_int () const {
   return static_cast <int> (get_length ());
}

double const & symbol::get_real () const {
   return m_real;
}

string const & symbol::get_string () const {
   return m_string;
}

symbol::symbol_type const & symbol::get_type () const {
   return m_type;
}

bool symbol::is_assign () const {
   return m_type == ts_assign;
}

bool symbol::is_colon () const {
   return m_type == ts_colon;
}

bool symbol::is_comma () const {
   return m_type == ts_comma;
}

bool symbol::is_division () const {
   return m_type == ts_division;
}

bool symbol::is_eof () const {
   return m_type == ts_eof;
}

bool symbol::is_identifier () const {
   return m_type == tc_identifier;
}

bool symbol::is_integer () const {
   return m_type == tc_integer;
}

bool symbol::is_keyword (int const code) const {
   return m_type == ts_user + code;
}

bool symbol::is_keyword (string const & keyword) const {
   return (m_type >= ts_user) && (m_string == keyword);
}

bool symbol::is_lpar () const {
   return m_type == ts_lpar;
}

bool symbol::is_minus () const {
   return m_type == ts_minus;
}

bool symbol::is_multiply () const {
   return m_type == ts_multiply;
}

bool symbol::is_number () const {
   return is_integer () || is_real ();
}

bool symbol::is_period () const {
   return m_type == ts_period;
}

bool symbol::is_plus () const {
   return m_type == ts_plus;
}

bool symbol::is_power () const {
   return m_type == ts_power;
}

bool symbol::is_real () const {
   return m_type == tc_real;
}

bool symbol::is_rpar () const {
   return m_type == ts_rpar;
}

bool symbol::is_semicolon () const {
   return m_type == ts_semicolon;
}

bool symbol::is_string () const {
   return m_type == tc_string;
}

bool symbol::is_value () const {
   return is_number () || is_string ();
}

symbol::operator double () const {
   return m_real;
}

symbol::operator int () const {
   return m_integer;
}

symbol::operator string () const {
   return m_string;
}
