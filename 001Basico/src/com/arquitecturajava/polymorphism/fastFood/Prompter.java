package com.arquitecturajava.polymorphism.fastFood;

import java.util.ArrayList;
import java.util.Iterator;

class Prompter {

    private ArrayList<Order> orders = new ArrayList<>();
    
    private void takeNote(Order ...orders) {
        for (Order order : orders) {
            System.out.println(order.getWelcomeMessage());
            this.orders.add(order);
        }
    }
    
    private void dispatch(Order ...orders) {
        for (Order order : orders) {
            System.out.println(order.getDeliveryMessage());
            this.orders.remove(order);
        }
    }
    
    private void dispatch() {
        Iterator<Order> iterator = this.orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order.getDeliveryMessage());
            iterator.remove();
        }
    }
    
    public static void main(String[] args) {
        PhoneOrder phone1 = new PhoneOrder("Manuela", "Cabezón de la Sal", 722846987);
        PhoneOrder phone2 = new PhoneOrder("Roberto", "Villanueva de la Peña", 655012398);
        PhoneOrder phone3 = new PhoneOrder("Mª Dolores", "Comillas", 633203583);
        WebOrder web1 = new WebOrder("Carla", "Cabrojo", "karlita_maki_87@hotmail.es");
        WebOrder web2 = new WebOrder("Esperanza", "Carrejo", "laespe.69@gmail.com");
        WebOrder web3 = new WebOrder("Beatriz", "Mazcuerras", "bea_rod_1991@outlook.es");
        PremisesOrder premises1 = new PremisesOrder("Wenceslao");
        PremisesOrder premises2 = new PremisesOrder("Ruperto");
        PremisesOrder premises3 = new PremisesOrder("Alba");
        
        Prompter prompter = new Prompter();
        prompter.takeNote(phone1, phone2, phone3, web1, web2, web3, premises1, premises2, premises3);
        prompter.dispatch(phone1, web1, premises1);
        prompter.dispatch();
    }
}
