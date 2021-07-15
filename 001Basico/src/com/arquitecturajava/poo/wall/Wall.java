package com.arquitecturajava.poo.wall;

import java.util.ArrayList;

public class Wall {

    private ArrayList<Tile> tiles = new ArrayList<>();
    
    private void addTile(Tile tile) {
        this.tiles.add(tile);
    }
    
    private void showTotalPrice() {
        double totalPrice = 0;
        for (Tile tile : this.tiles) {
            totalPrice += tile.getPrice();
        }
        System.out.printf("El precio total de los azulejos en la pared es de %.2f €.\n", totalPrice);
    }
    
    private void showTotalArea() {
        double totalArea = 0;
        for (Tile tile : this.tiles) {
            totalArea += tile.getArea();
        }
        System.out.printf("El área total de los azulejos en la pared es de %.2f €.\n", totalArea);
    }
    
    public static void main(String[] args) {
        Wall wall = new Wall();
        int[] dimensions = {2, 2};
        wall.addTile(new Tile(dimensions, 2));
        wall.addTile(new Tile(dimensions, 2));
        wall.addTile(new Tile(dimensions, 3));
        wall.addTile(new Tile(dimensions, 3));
        wall.showTotalArea();
        wall.showTotalPrice();
    }
}