package com.arquitecturajava.poo.inheritance_document;

class Book extends Document {
    
    private String publisher;

    Book(String author, String title, int pages) {
        super(author, title, pages);
        this.setPublisher(publisher);
    }

    String getPublisher() {
        return this.publisher;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}