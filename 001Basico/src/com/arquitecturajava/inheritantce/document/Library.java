package com.arquitecturajava.inheritantce.document;

public class Library {
    
    private static void showDocumentData(Document document) {
        System.out.println(document);
    }

    public static void main(String[] args) {
        Book book = new Book("Miguel de Cervantes", "Don Quijote de La Mancha", 200);
        Library.showDocumentData(book);
        Document document = new Document("Cecilio Álvarez Caules", "Java para newies", 1);
        Library.showDocumentData(document);
        Comic comic = new Comic("Stan Lee", "Hulk", 45, "Dale Keown");
        Library.showDocumentData(comic);
        DigitalBook digitalBook = new DigitalBook(book, "www.amazon.es");
        Library.showDocumentData(digitalBook);
    }
}