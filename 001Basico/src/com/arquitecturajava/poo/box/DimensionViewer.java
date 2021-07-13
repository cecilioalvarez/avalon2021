package com.arquitecturajava.poo.box;

class DimensionViewer {
    
    private Box box;

    private DimensionViewer(Box box) {
        this.box = box;
    }
    
    private void showBoxVolume() {
        System.out.printf("El voumen de la caja es de %.2f cm2.\n", this.box.getVolume());
    }
    
    private void showMinStoreDimensions() {
        Box minBox = this.box.getMinVolumeBox();
        System.out.printf("La caja cabe en un espacio mínimo de %.2f cm de ancho, %.2f cm de alto y %.2f cm de profundidad.\n", 
                minBox.getWidth(), minBox.getHeight(), minBox.getDepth());
    }

    public static void main(String[] args) {
        DimensionViewer dimensionViewer = new DimensionViewer(new Box(20, 20, 12.5));
        dimensionViewer.showBoxVolume();
        dimensionViewer.showMinStoreDimensions();
    }
}