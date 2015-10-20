//       $Id: scanner.cpp 2920 2006-11-30 18:10:30Z kulczyck $
//      $URL: file:///C:/Documents%20and%20Settings/kulczyck/Desktop/Desktop/SVN-Repository/Hochschule/Lehre/FH/BIN/SWE3/Programme/Scanner-II/src/scanner.cpp $
// $Revision: 2920 $
//     $Date: 2006-11-30 19:10:30 +0100 (Do, 30 Nov 2006) $
//   Creator: peter.kulczycki<AT>fh-hagenberg.at
//   $Author: kulczyck $
//
//   Remarks: rearrange the methods according to the header file

#include "scanner.h"
#include "scanner_impl.h"

#include <cassert>
#include <iostream>

using std::istream;
using std::string;

scanner::scanner () {
   m_pimpl = new scanner_impl (); assert (m_pimpl != 0);
}

scanner::scanner (istream & in) {
   m_pimpl = new scanner_impl (&in); assert (m_pimpl != 0);
}

scanner::~scanner () {
   delete m_pimpl;
}

size_t scanner::add_keyword (string const & keyword, int const code) {
   return m_pimpl->add_keyword (keyword, code);
}

bool scanner::eof () const {
   return m_pimpl->eof ();
}

int const & scanner::get_integer () const {
   return m_pimpl->get_integer ();
}

istream * scanner::get_istream () const {
   return m_pimpl->get_istream ();
}

scanner::position_type scanner::get_position () const {
   return m_pimpl->get_position ();
}

double const & scanner::get_real () const {
   return m_pimpl->get_real ();
}

string const & scanner::get_string () const {
   return m_pimpl->get_string ();
}

symbol const & scanner::get_symbol () const {
   return m_pimpl->get_symbol ();
}

symbol const &  scanner::next_symbol () {
   return m_pimpl->next_symbol ();
}

void scanner::remove_all_keywords () {
   return m_pimpl->remove_all_keywords ();
}

size_t scanner::remove_keyword (string const & keyword) {
   return m_pimpl->remove_keyword (keyword);
}

void scanner::set_istream () {
   m_pimpl->set_istream ();
}

void scanner::set_istream (istream & in) {
   m_pimpl->set_istream (&in);
}

string scanner::symbol_as_string () const {
   return m_pimpl->symbol_as_string ();
}

bool scanner::symbol_is_assign () const {
   return m_pimpl->symbol_is_assign ();
}

bool scanner::symbol_is_colon () const {
   return m_pimpl->symbol_is_colon ();
}

bool scanner::symbol_is_comma () const {
   return m_pimpl->symbol_is_comma ();
}

bool scanner::symbol_is_division () const {
   return m_pimpl->symbol_is_division ();
}

bool scanner::symbol_is_eof () const {
   return m_pimpl->symbol_is_eof ();
}

bool scanner::symbol_is_identifier () const {
   return m_pimpl->symbol_is_identifier ();
}

bool scanner::symbol_is_integer () const {
   return m_pimpl->symbol_is_integer ();
}

bool scanner::symbol_is_keyword (int const code) const {
   return m_pimpl->symbol_is_keyword (code);
}

bool scanner::symbol_is_keyword (string const & keyword) const {
   return m_pimpl->symbol_is_keyword (keyword);
}

bool scanner::symbol_is_lpar () const {
   return m_pimpl->symbol_is_lpar ();
}

bool scanner::symbol_is_minus () const {
   return m_pimpl->symbol_is_minus ();
}

bool scanner::symbol_is_multiply () const {
   return m_pimpl->symbol_is_multiply ();
}

bool scanner::symbol_is_number () const {
   return m_pimpl->symbol_is_number ();
}

bool scanner::symbol_is_period () const {
   return m_pimpl->symbol_is_period ();
}

bool scanner::symbol_is_plus () const {
   return m_pimpl->symbol_is_plus ();
}

bool scanner::symbol_is_power () const {
   return m_pimpl->symbol_is_power ();
}

bool scanner::symbol_is_real () const {
   return m_pimpl->symbol_is_real ();
}

bool scanner::symbol_is_rpar () const {
   return m_pimpl->symbol_is_rpar ();
}

bool scanner::symbol_is_semicolon () const {
   return m_pimpl->symbol_is_semicolon ();
}

bool scanner::symbol_is_string () const {
   return m_pimpl->symbol_is_string ();
}

bool scanner::symbol_is_value () const {
   return m_pimpl->symbol_is_value ();
}

scanner::operator double () const {
   return m_pimpl->operator double ();
}

scanner::operator int () const {
   return m_pimpl->operator int ();
}

scanner::operator position_type () const {
   return m_pimpl->operator position_type ();
}

scanner::operator istream * () const {
   return m_pimpl->operator istream * ();
}

scanner::operator string () const {
   return m_pimpl->operator string ();
}

scanner::operator symbol () const {
   return m_pimpl->operator symbol ();
}
