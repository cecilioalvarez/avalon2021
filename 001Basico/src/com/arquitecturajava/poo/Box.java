package com.arquitecturajava.poo;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    
    public double getVolume() {
        return this.depth * this.height * this.width;
    }
}