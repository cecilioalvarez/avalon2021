package com.arquitecturajava.poo;

public class Rectangle {

    private double width;
    private double height;
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    double getArea() {
        return this.height * this.width;
    }
}