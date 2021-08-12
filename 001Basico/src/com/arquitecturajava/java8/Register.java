package com.arquitecturajava.java8;

import com.arquitecturajava.java8.comparators.PersonNameAndSurnameComparator;
import com.arquitecturajava.java8.comparators.PersonNameComparator;
import com.arquitecturajava.java8.comparators.PersonSurnameComparator;
import com.arquitecturajava.java8.filters.PersonFilterByAge;
import com.arquitecturajava.java8.filters.PersonFilterByName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

class Register {
    
    private final List<Person> PEOPLE = new ArrayList<>();
    
    private void showPeople() {
        this.PEOPLE.forEach(person -> System.out.println(person.toString()));
    }
    
    private void showPeople(List<Person> people) {
        people.forEach(person -> System.out.println(person.toString()));
    }
    
    private void addPeople(Person ...people) {
        Arrays.asList(people).forEach(person -> this.PEOPLE.add(person));
    }
    
    private void sortByAge() {
        Collections.sort(this.PEOPLE);
    }
    
    private void sortByName() {
        this.PEOPLE.sort(new PersonNameComparator());
    }
    
    private void sortBySurname() {
        this.PEOPLE.sort(new PersonSurnameComparator());
    }
    
    private void sortByNameAndSurname() {
        this.PEOPLE.sort(new PersonNameAndSurnameComparator());
    }
    
    private List<Person> filterPeople(Predicate<Person> filter) {
        final List<Person> SEARCHED_PEOPLE = new ArrayList<>();
        for (Person person: this.PEOPLE) {
            if (filter.test(person)) {
                SEARCHED_PEOPLE.add(person);
            }
        }
        return SEARCHED_PEOPLE;
    }

    public static void main(String[] args) {
        Register register = new Register();
        register.addPeople(
                new Person("Pablo", "Benítez", 19), 
                new Person("Pablo", "Pérez", 17), 
                new Person("Desiré", "Cuesta", 16),
                new Person("Andrea", "Velázquez", 17), 
                new Person("Andrea", "Pérez", 15),
                new Person("Desiré", "Pérez", 19),
                new Person("Pablo", "Antúnez", 29), 
                new Person("Andrea", "Benítez", 25), 
                new Person("Desiré", "Hernández", 16)
            );
        System.out.println("\n***Sin ordenar:***\n");
        register.showPeople();
        System.out.println("\n***Ordenados por edad:***\n");
        register.sortByAge();
        register.showPeople();
        System.out.println("\n***Ordenados por nombre:***\n");
        register.sortByName();
        register.showPeople();
        System.out.println("\n***Ordenados por apellido:***\n");
        register.sortBySurname();
        register.showPeople();
        System.out.println("\n***Ordenados por nombre y apellido:***\n");
        register.sortByNameAndSurname();
        register.showPeople();
        String searchedName = "Desiré";
        System.out.println("\n***Filtrados por nombre «" + searchedName + "»:***\n");
        register.showPeople(register.filterPeople(new PersonFilterByName(searchedName)));
        String searchedSurname = "Pérez";
        System.out.println("\n***Filtrados por apellido «" + searchedSurname + "»:***\n");
        register.showPeople(register.filterPeople((person) -> person.getSurname().equals(searchedSurname)));
        int searchedAge = 19;
        System.out.println("\n***Filtrados por edad «" + searchedAge + "» años:***\n");
        register.showPeople(register.filterPeople(new PersonFilterByAge(searchedAge)));
    }
}