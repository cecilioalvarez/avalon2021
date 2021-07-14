package com.arquitecturajava.poo.geometry;

class GeometryCalculator {

    static double getArea(Rectangle rectangle) {
        return rectangle.getHeight() * rectangle.getWidth();
    }
    
    static double getArea(Circle circle) {
        return circle.getRadius() * Math.pow(Math.PI, 2);
    }
    
    static double getPerimeter(Rectangle rectangle) {
        return rectangle.getHeight() * 2 + rectangle.getWidth() * 2;
    }
    
    static double getPerimeter(Circle circle) {
        return circle.getRadius() * 2 * Math.PI;
    }
}