package com.arquitecturajava.poo.person;

import java.util.ArrayList;

class CivilRegister {
    
    private final ArrayList<Person> PEOPLE;

    private CivilRegister() {
        this.PEOPLE = new ArrayList<>();
    }

    private ArrayList getPeople() {
        return this.PEOPLE;
    }

    private void addPerson(Person person) {
        this.PEOPLE.add(person);
    }

    private void showPeopleData() {
        for (Person person : this.PEOPLE) {
            System.out.println(person.toString());
        }
    }

    public static void main(String[] args) {
        CivilRegister civilRegister = new CivilRegister();
        
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(17);
        person.setPet(new Pet("Calcetines", new Illness()));
        person.setGender(Gender.MALE);
        
        civilRegister.addPerson(person);
        civilRegister.addPerson(new Person("Francisca", 89, new Phone(722597102, "Motorola"), new Pet("Toby", new Illness("Fibrosis", Extent.ACUTE)), Gender.FEMALE));
        civilRegister.addPerson(new Person("Andrea", 52, new Phone(654880307, "Sony"), null, Gender.OTHER));
        
        civilRegister.showPeopleData();
    }
}