//       $Id: symbol.h 3035 2006-12-07 18:09:21Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/trunk/src/symbol.h $
// $Revision: 3035 $
//     $Date: 2006-12-07 19:09:21 +0100 (Do, 07 Dez 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $

#if !defined SYMBOL_H
#define      SYMBOL_H

#include "base.h"

class symbol {
   public:
      enum symbol_type {
         ts_eof        = 0x0000,
         ts_assign     = 0x2000, ts_colon   = 0x2001, ts_comma = 0x2002, ts_division = 0x2003, ts_lpar = 0x2004, ts_minus = 0x2005, ts_multiply = 0x2006, ts_period = 0x2007, ts_plus = 0x2008, ts_power = 0x2009, ts_rpar = 0x200A, ts_semicolon = 0x200B,
         tc_identifier = 0x4000, tc_integer = 0x4001, tc_real  = 0x4002, tc_string   = 0x4003,
         ts_user       = 0x6000
      };

      symbol (symbol_type const & type = ts_eof, size_t const length = 0, std::string const & str = "", int const integer = 0, double const real = 0);
     ~symbol ();

      std::string         as_string      () const;
      bool                eof            () const;
      int const &         get_integer    () const;
      size_t const &      get_length     () const;
      int                 get_length_int () const;
      double const &      get_real       () const;
      std::string const & get_string     () const;
      symbol_type const & get_type       () const;

      bool is_assign     () const;
      bool is_colon      () const;
      bool is_comma      () const;
      bool is_division   () const;
      bool is_eof        () const;
      bool is_identifier () const;
      bool is_integer    () const;
      bool is_keyword    (int const code) const;
      bool is_keyword    (std::string const & keyword) const;
      bool is_lpar       () const;
      bool is_minus      () const;
      bool is_multiply   () const;
      bool is_number     () const;
      bool is_period     () const;
      bool is_plus       () const;
      bool is_power      () const;
      bool is_real       () const;
      bool is_rpar       () const;
      bool is_semicolon  () const;
      bool is_string     () const;
      bool is_value      () const;

      operator double      () const;
      operator int         () const;
      operator std::string () const;

   private:
      int         m_integer;
      size_t      m_length;
      double      m_real;
      std::string m_string;
      symbol_type m_type;
};

#endif   // SYMBOL_H
