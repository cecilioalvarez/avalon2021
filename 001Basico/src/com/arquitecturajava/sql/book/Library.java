package com.arquitecturajava.sql.book;

import java.util.List;

class Library {
    
    private void showBooksWithChapters() {
        System.out.println("A continuación se muestra el listado completo de registros en la tabla «Libro» que tienen capítulos:");
        final List<Book> BOOKS = new BookRepositoryJDBC().selectWithChapters();
        BOOKS.forEach(book -> System.out.println(book.toString()));
    }
    
    private void showBooks() {
        System.out.println("A continuación se muestra el listado completo de registros en la tabla «Libro»:");
        final List<Book> BOOKS = new BookRepositoryJDBC().select();
        BOOKS.forEach(book -> System.out.println(book.toString()));
    }
    
    private void showBook(Book book) {
        System.out.println("A continuación se muestran los datos del libro con ISBN «" + book.getPK_ISBN() + "»:");
        book = new BookRepositoryJDBC().selectWithChapters(book);
        System.out.println(book.toString());
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.showBooks();
        library.showBooksWithChapters();
        library.showBook(new Book("5fksir68r30hh"));
    }
}