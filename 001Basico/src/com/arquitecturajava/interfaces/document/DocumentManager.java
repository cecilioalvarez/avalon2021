package com.arquitecturajava.interfaces.document;

import java.util.Arrays;
import java.util.HashSet;

class DocumentManager {
    
    private final HashSet<Document> DOCUMENT = new HashSet<>();
    
    private void showDocuments() {
        this.DOCUMENT.forEach(document -> System.out.println(document.toString()));
    }

    private void save(Document ...documents) {
        this.DOCUMENT.addAll(Arrays.asList(documents));
    }
    
    private void upgradeVersion(Document ...documents) {
        Arrays.asList(documents).forEach(document -> {
            if (this.DOCUMENT.contains(document)) {
                document.upgradeVersion();
                this.DOCUMENT.remove(document);
                this.DOCUMENT.add(document);
            }
        });
    }
    
    public static void main(String[] args) {
        DocumentManager documentManager = new DocumentManager();
        Document doc1 = new Document("El primero", "Contenido del primero.");
        Document doc2 = new Document(1.5f, "El segundo", "Contenido del segundo.");
        Document doc3 = new Document(1.3f, "El tercero", "Contenido del tercero.");
        documentManager.save(doc1, doc2, doc3);
        documentManager.showDocuments();
        documentManager.upgradeVersion(doc2, doc3);
        documentManager.showDocuments();
    }
}