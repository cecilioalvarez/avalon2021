package com.arquitecturajava.poo;

public class Box {

    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.setWidth(width);
        this.setHeight(height);
        this.setDepth(depth);
    }

    double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    double getDepth() {
        return this.depth;
    }

    private void setDepth(double depth) {
        this.depth = depth;
    }
    
    double getVolume() {
        return this.getDepth() * this.getHeight() * this.getWidth();
    }
    
    public Box getMinVolumeBox() {
        double extraSpace = 20; // Percentage.
        return new Box(this.getWidth() * (extraSpace/100 + 1), this.getHeight() * (extraSpace/100 + 1), this.getDepth() * (extraSpace/100 + 1));
    }
}