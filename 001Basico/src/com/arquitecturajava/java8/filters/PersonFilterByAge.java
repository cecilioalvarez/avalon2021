package com.arquitecturajava.java8.filters;

import com.arquitecturajava.java8.Person;
import java.util.function.Predicate;

public class PersonFilterByAge implements Predicate<Person> {

    private final int AGE;

    public PersonFilterByAge(int age) {
        this.AGE = age;
    }
    
    @Override
    public boolean test(Person person) {
        return this.AGE == person.getAge();
    }
}