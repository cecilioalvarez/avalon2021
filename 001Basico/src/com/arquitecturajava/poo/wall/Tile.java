package com.arquitecturajava.poo.wall;

class Tile {

    private int[] dimensions = new int[2];
    private double price;

    public Tile(int[] dimensions, double price) {
        this.setDimensions(dimensions);
        this.setPrice(price);
    }

    void setDimensions(int[] dimensions) {
        this.dimensions[0] = dimensions[0];
        this.dimensions[1] = dimensions[1];
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }
    
    double getArea() {
        return this.dimensions[0] * this.dimensions[1];
    }
}