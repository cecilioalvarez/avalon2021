package com.arquitecturajava.java8.optional;

import com.arquitecturajava.java8.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Service {
    
    private final List<Person> PEOPLE = new ArrayList<>();

    void addPerson(Person ...people) {
        Arrays.asList(people).forEach(person -> this.PEOPLE.add(person));
    }
    
    Optional<Person> findPerson(Person searchedPerson) {
        return this.PEOPLE.stream()
                .filter(person -> searchedPerson.equals(person))
                .findFirst();
    }
}