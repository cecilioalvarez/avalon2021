package com.arquitecturajava.poo.wall;

class Tile {

    private int[] dimensions = new int[2];
    private double price;

    Tile(int[] dimensions, double price) {
        this.dimensions = dimensions;
        this.price = price;
    }

    double getPrice() {
        return this.price;
    }
    
    double getArea() {
        return this.dimensions[0] * this.dimensions[1];
    }
}