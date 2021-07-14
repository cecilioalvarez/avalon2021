package com.arquitecturajava.poo.geometry;

public class Rectangle implements GeometricFigure {

    private static final String NAME = "rectángulo";
    private double width;
    private double height;
    
    Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }
    
    Rectangle(double side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    double getWidth() {
        return this.width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return GeometryCalculator.getArea(this);
    }
    
    @Override
    public double getLength() {
        return GeometryCalculator.getLength(this);
    }

    @Override
    public String getName() {
        return Rectangle.NAME;
    }
}