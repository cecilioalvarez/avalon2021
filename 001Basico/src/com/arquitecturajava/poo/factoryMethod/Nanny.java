package com.arquitecturajava.poo.factoryMethod;

import java.util.ArrayList;
import java.util.Collections;

class Nanny {
    
    private final ArrayList<Baby> BABIES = new ArrayList<>();
    
    private void addBabies(Baby ...babies) {
        Collections.addAll(this.BABIES, babies);
    }
    
    private void takeToBathroom() {
        this.BABIES.forEach(baby -> System.out.println(baby.pee()));
    }
    
    public static void main(String[] args) {
        Baby baby1 = BabyFactory.getBaby("niña", "Carla");
        Baby baby2 = BabyFactory.getBaby("niña", "Isabel");
        Baby baby3 = BabyFactory.getBaby("niño", "Roberto");
        Baby baby4 = BabyFactory.getBaby("niño", "Andrés");
        Baby baby5 = BabyFactory.getBaby("niña", "Elsa");
        Baby baby6 = BabyFactory.getBaby("niña", "Aurora");
        
        Nanny nanny = new Nanny();
        nanny.addBabies(baby1, baby2, baby3, baby4, baby5, baby6);
        nanny.takeToBathroom();
    }
}