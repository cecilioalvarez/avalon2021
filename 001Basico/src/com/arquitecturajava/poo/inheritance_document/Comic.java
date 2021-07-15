package com.arquitecturajava.poo.inheritance_document;

class Comic extends Book {

    private String drawer;

    Comic(String author, String title, int pages, String drawer) {
        super(author, title, pages);
        this.setDrawer(drawer);
    }

    String getDrawer() {
        return this.drawer;
    }

    void setDrawer(String drawer) {
        this.drawer = drawer;
    }
}