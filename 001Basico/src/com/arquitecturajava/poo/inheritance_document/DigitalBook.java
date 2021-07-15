package com.arquitecturajava.poo.inheritance_document;

class DigitalBook extends Document {

    private String platform;

    DigitalBook(String author, String title, int pages, String platform) {
        super(author, title, pages);
        this.setPlatform(platform);
    }

    public DigitalBook(Book book, String platform) {
        super(book.getAuthor(), book.getTitle(), book.getPages());
        this.setPlatform(platform);
    }

    String getPlatform() {
        return this.platform;
    }

    void setPlatform(String platform) {
        this.platform = platform;
    }
}