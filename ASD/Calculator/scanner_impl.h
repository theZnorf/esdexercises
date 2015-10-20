//       $Id: scanner_impl.h 3053 2006-12-09 13:07:29Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/trunk/src/scanner_impl.h $
// $Revision: 3053 $
//     $Date: 2006-12-09 14:07:29 +0100 (Sa, 09 Dez 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $

#if !defined SCANNER_IMPL_H
#define      SCANNER_IMPL_H

#include "scanner.h"
#include "symbol.h"

#include <map>

class scanner_impl {
   friend class scanner;

   private:
      typedef scanner::position_type position_type;
      typedef symbol::symbol_type    symbol_type;

      static bool is_alpha     (char const c);
      static bool is_alphanum   (char const c);
      static bool is_whitespace (char const c);

      scanner_impl (std::istream * const pin = 0);
     ~scanner_impl ();

      std::istream * get_istream () const;
      void           set_istream (std::istream * const pin = 0);

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

      void        morph_identifier (std::string const & keyword);
      void        next_char        ();
      void        on_new_istream   ();
      void        scan_comment_ml  ();
      void        scan_comment_sl  ();
      void        scan_identifier  ();
      void        scan_number      (int const sign, size_t const sign_length);
      void        scan_string      ();
      symbol_type to_type          (std::string const & name) const;

                     scanner_impl (scanner_impl const &);
      scanner_impl & operator =   (scanner_impl const &);

      typedef std::map <std::string, symbol_type> keyword_list;
      typedef keyword_list::const_iterator        keyword_itor;

      static size_t const c_size = 513;

      char *         m_buffer;
      char           m_chr;
      keyword_list   m_keywords;
      size_t         m_length;
      std::istream * m_pin;
      size_t         m_pos;
      position_type  m_pos_t;
      position_type  m_pos_t_p;
      symbol         m_symbol;
};

#endif   // SCANNER_IMPL_H
