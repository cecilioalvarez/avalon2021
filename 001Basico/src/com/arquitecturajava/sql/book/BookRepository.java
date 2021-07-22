package com.arquitecturajava.sql.book;

import java.util.List;

interface BookRepository {
    Book selectWithChapters(Book book);
    List<Book> selectWithChapters();
    List<Book> select(String fk_author);
    int insert(Book book);
    int delete(Book book);
    int delete(String fk_author);
    int update(Book book);
    int updatePk_isbn(Book book, String pk_isbn);
    int updateTitle(Book book, String title);
    int updateAuthor(Book book, Author author);
}