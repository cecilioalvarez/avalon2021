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
            if (person.getCalifications().isEmpty()) {
                System.out.println(person.getName() + " no tiene notas registradas.");
            } else {
                int califications_count = 0;
                int califications_sum = 0;
                Calification highest_calification = null;
                for (Calification calification : person.getCalifications()) {
                    califications_count++;
                    califications_sum += calification.getValue();
                    if (highest_calification == null || calification.getValue() >= highest_calification.getValue()) {
                        highest_calification = calification;
                    }
                }
                System.out.println("La media de las notas de " + person.getName() + " es de " + (califications_sum/califications_count) + ".");
                System.out.println("La nota más alta de " + person.getName() + " es un " + highest_calification.getValue() + " en " + highest_calification.getSubject() + ".");
            }
        });
    }

    public static void main(String[] args) {
        CivilRegister civilRegister = new CivilRegister();
        
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(17);
        person.setPet(new Pet("Calcetines", new Illness()));
        person.setGender(Gender.MALE);
        person.addCalification(new Calification("Sistemas informáticos", 4));
        person.addCalification(new Calification("Programación", 9));
        person.addCalification(new Calification("Diseño de interfaces", 7));
        
        civilRegister.addPerson(person);
        civilRegister.addPerson(new Person("Francisca", 89, new Phone(722597102, "Motorola"), new Pet("Toby", new Illness("Fibrosis", Extent.ACUTE)), Gender.FEMALE));
        civilRegister.addPerson(new Person("Andrea", 52, new Phone(654880307, "Sony"), null, Gender.OTHER));
        
        civilRegister.showPeopleData();
        civilRegister.showCalifications();
    }
}