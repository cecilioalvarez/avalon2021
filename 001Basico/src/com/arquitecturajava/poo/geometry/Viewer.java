package com.arquitecturajava.poo.geometry;

import com.arquitecturajava.poo.io.IOHelper;

class Viewer {
    
    private GeometricFigure figure;

    private Viewer(GeometricFigure figure) {
        this.setFigure(figure);
    }

    private void setFigure(GeometricFigure figure) {
        this.figure = figure;
    }
    
    private void showDimensions() {
        System.out.printf("El " + this.figure.getName() + " tiene un perímetro de %.2f cm y un área de %.2f cm².\n", + this.figure.getPerimeter(), this.figure.getArea());
    }
    
    public static void main(String[] args) {
        System.out.println("Vamos a crear un " + Rectangle.NAME + ":");
        Rectangle rectangle = new Rectangle(IOHelper.askForDouble("el ancho"), IOHelper.askForDouble("el alto"));
        Viewer viewer = new Viewer(rectangle);
        viewer.showDimensions();
        
        System.out.println("Vamos a crear un " + Circle.NAME + ":");
        Circle circle = new Circle(IOHelper.askForDouble("el radio"));
        viewer.setFigure(circle);
        viewer.showDimensions();
    }
}