package com.arquitecturajava.poo.geometry;

class Rectangle implements GeometricFigure {

    static final String NAME ="rectángulo";
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
        if (this.validateSide(width)) {
            this.width = width;
        }
    }

    double getHeight() {
        return this.height;
    }

    void setHeight(double height) {
        if (this.validateSide(height)) {
            this.height = height;
        }
    }
    
    private boolean validateSide(double side) {
        return side > 0;
    }
    
    @Override
    public double getArea() {
        return GeometryCalculator.getArea(this);
    }
    
    @Override
    public double getPerimeter() {
        return GeometryCalculator.getPerimeter(this);
    }

    @Override
    public String getName() {
        return Rectangle.NAME;
    }
}