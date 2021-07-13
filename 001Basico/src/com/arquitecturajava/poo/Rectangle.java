package com.arquitecturajava.poo;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
    }
    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    double getArea() {
        return this.height * this.width;
    }
    
    double getLength() {
        return this.height * 2 + this.width * 2;
    }
}