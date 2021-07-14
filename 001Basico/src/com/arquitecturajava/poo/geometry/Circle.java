package com.arquitecturajava.poo.geometry;

class Circle implements GeometricFigure {

    private static final String NAME = "círculo";
    private double radius;

    Circle(double radius) {
        this.setRadius(radius);
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
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
        return Circle.NAME;
    }
}