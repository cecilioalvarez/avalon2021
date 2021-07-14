package com.arquitecturajava.poo.book;

class Book {
    
    private static int bookCount;
    private String title;
    private String author;
    private int pages;

    Book(String title, String author, int pages) {
        Book.bookCount++;
        this.setTitle(title);
        this.setAuthor(author);
        this.setPages(pages);
    }

    static int getBookCount() {
        return Book.bookCount;
    }

    static void setBookCount(int bookCount) {
        Book.bookCount = bookCount;
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    int getPages() {
        return this.pages;
    }

    void setPages(int pages) {
        this.pages = pages;
    }
}