package com.arquitecturajava.poo;

public class Main_Person {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Manuel");
        p1.setAge(19);
        System.out.println(p1.toString());
        System.out.println(p1.getName() + (p1.isAdult() ? " " : " no ") + "es mayor de edad.");
        System.out.println(p1.getName() + (p1.isRetired()? " " : " no ") + "está jubilada/o.");
        
        Person p2 = new Person();
        p2.setName("Francisca");
        p2.setAge(89);
        System.out.println(p2.toString());
        System.out.println(p2.getName() + (p2.isAdult() ? " " : " no ") + "es mayor de edad.");
        System.out.println(p2.getName() + (p2.isRetired()? " " : " no ") + "está jubilada/o.");
    }
}