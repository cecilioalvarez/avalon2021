package com.arquitecturajava.poo.bulb_1;

class Room {
    
    private Bulb bulb;

    public Room() {
        this.bulb = new Bulb();
    }
    
    private void playWithTheLight() {
        System.out.println(this.bulb.toString());
        this.bulb.setOn(5);
        System.out.println(this.bulb.toString());
        this.bulb.setOn();
        System.out.println(this.bulb.toString());
        this.bulb.setOn(true);
        System.out.println(this.bulb.toString());
        this.bulb.setLumens(10);
        System.out.println(this.bulb.toString());
    }

    public static void main(String[] args) {
        new Room().playWithTheLight();
    }
}