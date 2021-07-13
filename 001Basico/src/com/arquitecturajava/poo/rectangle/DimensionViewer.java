package com.arquitecturajava.poo.rectangle;

public class DimensionViewer {
    
    private Rectangle rectangle;

    private DimensionViewer(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    
    private void showDimensions() {
        System.out.printf("El área del rectángulo es de %.2f cm2.\n", this.rectangle.getArea());
        System.out.printf("La longitud del rectángulo es de %.2f cm.\n", this.rectangle.getLength());
    }
    
    public static void main(String[] args) {
        new DimensionViewer(new Rectangle(10, 5)).showDimensions();
    }
}