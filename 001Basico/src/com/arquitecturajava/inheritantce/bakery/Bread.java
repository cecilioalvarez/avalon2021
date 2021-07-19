package com.arquitecturajava.inheritantce.bakery;

abstract class Bread {

    private double weight;
    private String[] ingredients;

    public Bread(double weight, String[] ingredients) {
        this.weight = weight;
        this.ingredients = ingredients;
    }

    double getWeight() {
        return this.weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    String[] getIngredients() {
        return this.ingredients;
    }

    void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }
    
    abstract String cook();
}