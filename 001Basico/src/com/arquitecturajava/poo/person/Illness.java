package com.arquitecturajava.poo.person;

public class Illness {

    private String name;
    private Extent extent;

    Illness() {
        this.setName("Desconocida");
        this.setExtent(Extent.MEDIUM);
    }

    Illness(String name, Extent extent) {
        this.setName(name);
        this.setExtent(extent);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    Extent getExtent() {
        return this.extent;
    }

    void setExtent(Extent extent) {
        this.extent = extent;
    }
}