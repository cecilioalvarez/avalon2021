package com.arquitecturajava.sql.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Book {

    private final String PK_ISBN;
    private String title;
    private Author fk_author;
    private List<Chapter> chapters;

    public Book(String PK_ISBN) {
        this.PK_ISBN = PK_ISBN;
        this.chapters = new ArrayList<>();
    }

    Book(String ISBN, String title, Author fk_author) {
        this.PK_ISBN = ISBN;
        this.title = title;
        this.fk_author = fk_author;
        this.chapters = new ArrayList<>();
    }
    
    String getPK_ISBN() {
        return this.PK_ISBN;
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    Author getFk_author() {
        return this.fk_author;
    }

    void setFk_author(Author fk_author) {
        this.fk_author = fk_author;
    }

    List<Chapter> getChapters() {
        return this.chapters;
    }

    void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
    
    void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.PK_ISBN);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.PK_ISBN, other.PK_ISBN)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + this.PK_ISBN.toUpperCase() + "] " + this.title + " - Autor: " + this.fk_author.getName() + ".";
    }
}