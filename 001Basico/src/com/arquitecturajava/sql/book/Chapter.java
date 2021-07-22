package com.arquitecturajava.sql.book;

class Chapter {

    private final String PK_TITLE;
    private final int PAGES;
    private Book fk_book;

    Chapter(String title, int pages, Book fk_book) {
        this.PK_TITLE = title;
        this.PAGES = pages;
        this.fk_book = fk_book;
    }
    
    Chapter(String title, int pages) {
        this.PK_TITLE = title;
        this.PAGES = pages;
    }

    String getPK_TITLE() {
        return this.PK_TITLE;
    }

    int getPAGES() {
        return this.PAGES;
    }

    Book getFk_book() {
        return this.fk_book;
    }

    @Override
    public String toString() {
        return "[" + this.fk_book.getTitle() + "] Capítulo: " + this.PK_TITLE + " [" + this.PAGES + " pags]";
    }
}