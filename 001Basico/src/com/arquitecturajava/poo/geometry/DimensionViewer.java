package com.arquitecturajava.poo.geometry;

import com.arquitecturajava.poo.io.IOHelper;

class DimensionViewer {
    
    private GeometricFigure figure;

    private DimensionViewer(GeometricFigure figure) {
        this.setFigure(figure);
    }

    private void setFigure(GeometricFigure figure) {
        this.figure = figure;
    }
    
    private void showDimensions() {
        System.out.printf("El área del " + this.figure.getName() + " es de %.2f cm2.\n", this.figure.getArea());
        System.out.printf("La longitud del " + this.figure.getName() + " es de %.2f cm.\n", this.figure.getLength());
    }
    
    public static void main(String[] args) {
        System.out.println("Vamos a crear un rectángulo:");
        Rectangle rectangle = new Rectangle(IOHelper.askForDouble(), IOHelper.askForDouble());
        DimensionViewer dimensionViewer = new DimensionViewer(rectangle);
        dimensionViewer.showDimensions();
        
        System.out.println("Vamos a crear un círculo:");
        Circle circle = new Circle(IOHelper.askForDouble());
        dimensionViewer.setFigure(circle);
        dimensionViewer.showDimensions();
    }
}