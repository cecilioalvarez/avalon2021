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
        this.PEOPLE.forEach(person -> System.out.println(person.toString()));
    }
    
    private void showCalifications() {
        this.PEOPLE.forEach(person -> {
            System.out.println(person.getName() + " " + (person.getCalificationsResume() == null ? "no tiene notas registradas." : person.getCalificationsResume().toString()));
        });
    }
    
    private void showBestsCalification(String subject) {
        this.PEOPLE.forEach(person -> {
            Calification maxCalification = person.getHighestCalification(subject);
            if (maxCalification == null) {
                System.out.println(person.getName() + " no tiene notas registradas de la asignatura " + subject + ".");
            } else {
                System.out.println("La mejor nota de " + person.getName() + " en " + subject + " es un " + maxCalification.getValue() + ".");
            }
        });
    }

    public static void main(String[] args) {
        CivilRegister civilRegister = new CivilRegister();
        
        civilRegister.addPerson(new Person("Francisca", 89, new Phone(722597102, "Motorola"), new Pet("Toby", new Illness("fibrosis", Extent.ACUTE)), Gender.FEMALE));
        civilRegister.addPerson(new Person("Andrea", 52, new Phone(654880307, "Sony"), null, Gender.OTHER));
        
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(17);
        person.setPet(new Pet("Calcetines", new Illness()));
        person.setGender(Gender.MALE);
        person.addCalification(new Calification("Sistemas informáticos", 4));
        person.addCalification(new Calification("Programación", 9));
        person.addCalification(new Calification("Programación", 6));
        person.addCalification(new Calification("Entornos de desarrollo", 9));
        person.addCalification(new Calification("Lenguajes de marcas y sistemas de gestión de la información", 7));
        person.addCalification(new Calification("Formación y orientación laboral", 5));
        
        civilRegister.addPerson(person);
        person.removeCalification("Entornos de desarrollo");
        System.out.println(person.getCalifications());
        person.removeCalification(0);
        System.out.println(person.getCalifications());
        
        civilRegister.showPeopleData();
        civilRegister.showCalifications();
        civilRegister.showBestsCalification("Programación");
    }
}