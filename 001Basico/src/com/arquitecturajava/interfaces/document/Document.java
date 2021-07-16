package com.arquitecturajava.interfaces.document;

import java.util.Objects;

class Document {

    private float version;
    private String title;
    private String content;
    
    Document(String title, String content) {
        this.version = 1.1f;
        this.title = title;
        this.content = content;
    }

    Document(float version, String title, String content) {
        this.version = version;
        this.title = title;
        this.content = content;
    }

    float getVersion() {
        return this.version;
    }
    
    void upgradeVersion() {
        this.version += 0.1f;
    }

    String getTitle() {
        return this.title;
    }

    String getContent() {
        return this.content;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.title);
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
        final Document other = (Document) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "El contenido del documento con título «" + this.title + "» y versión " + this.version + " es: " + this.content;
    }
}