package com.arquitecturajava.poo.person;

class Phone {

    private int number;
    private String brand;
    
    Phone() {
        this.setNumber(600000000);
        this.setBrand("Sin marca");
    }

    Phone(int number, String brand) {
        this.setNumber(number);
        this.setBrand(brand);
    }
    
    int getNumber() {
        return this.number;
    }

    void setNumber(int number) {
        this.number = number;
    }

    String getBrand() {
        return this.brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.getBrand() + " [" + this.getNumber() + "]";
    }
}