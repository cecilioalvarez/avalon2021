package com.arquitecturajava.poo.factoryMethod;

import java.util.ArrayList;
import java.util.Collections;

class Nanny {
    
    private ArrayList<Baby> babies = new ArrayList<>();
    
    private void addBabies(Baby ...babies) {
        Collections.addAll(this.babies, babies);
    }
    
    private void takeToBathroom() {
        this.babies.forEach(baby -> System.out.println(baby.pee()));
    }
    
    public static void main(String[] args) {
        Baby baby1 = BabyFactory.getBaby(Gender.GIRL, "Carla");
        Baby baby2 = BabyFactory.getBaby(Gender.GIRL, "Isabel");
        Baby baby3 = BabyFactory.getBaby(Gender.BOY, "Roberto");
        Baby baby4 = BabyFactory.getBaby(Gender.BOY, "Andrés");
        Baby baby5 = BabyFactory.getBaby(Gender.BOY, "Elsa");
        Baby baby6 = BabyFactory.getBaby(Gender.BOY, "Aurora");
        
        Nanny nanny = new Nanny();
        nanny.addBabies(baby1, baby2, baby3, baby4, baby5, baby6);
        
        nanny.takeToBathroom();
    }
}