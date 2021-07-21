package com.arquitecturajava.sql.book;

class Book {

    private final String PK_ISBN;
    private String title;
    private String fk_id;

    Book(String ISBN, String title, String authorId) {
        this.PK_ISBN = ISBN;
        this.title = title;
        this.fk_id = authorId;
    }

    String getPK_ISBN() {
        return this.PK_ISBN;
    }

    String getTitle() {
        return this.title;
    }

    String getFk_id() {
        return this.fk_id;
    }

    @Override
    public String toString() {
        return "[" + this.PK_ISBN.toUpperCase() + "] " + this.title + " - Autor: " + this.fk_id + ".";
    }
}

class DaoBook {

    private final String PK_ISBN;
    private String title;
    private String authorName;

    DaoBook(String ISBN, String title, String authorId) {
        this.PK_ISBN = ISBN;
        this.title = title;
        this.authorName = authorId;
    }

    String getPK_ISBN() {
        return this.PK_ISBN;
    }

    String getTitle() {
        return this.title;
    }

    String getAuthorName() {
        return this.authorName;
    }

    @Override
    public String toString() {
        return "[" + this.PK_ISBN.toUpperCase() + "] " + this.title + " - Autor: " + this.authorName + ".";
    }
}