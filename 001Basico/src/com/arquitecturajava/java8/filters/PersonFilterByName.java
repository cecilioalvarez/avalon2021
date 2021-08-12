package com.arquitecturajava.java8.filters;

import com.arquitecturajava.java8.Person;
import java.util.function.Predicate;

public class PersonFilterByName implements Predicate<Person> {

    private final String NAME;

    public PersonFilterByName(String name) {
        this.NAME = name;
    }

    @Override
    public boolean test(Person person) {
        return this.NAME.equals(person.getName());
    }
}