package com.arquitecturajava.poo.geometry;

class Circle implements GeometricFigure {

    static final String NAME = "círculo";
    private double radius;

    Circle(double radius) {
        this.setRadius(radius);
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        if (this.validateRadius(radius)) {
            this.radius = radius;
        }
    }
    
    boolean validateRadius(double radius) {
        return radius > 0;
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
        return Circle.NAME;
    }
}