package com.arquitecturajava.inheritantce.document;

class Document {

    private String author;
    private String title;
    private int pages;

    Document(String author, String title, int pages) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPages(pages);
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getTitle() {
        return this.title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getPages() {
        return this.pages;
    }

    void setPages(int pages) {
        this.pages = pages;
    }
}