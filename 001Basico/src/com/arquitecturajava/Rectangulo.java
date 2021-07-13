package com.arquitecturajava;

public class Rectangulo {

    private double width;
    private double height;
    
    Rectangulo(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double getArea() {
        return this.height * this.width;
    }
}