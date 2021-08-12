package com.arquitecturajava.java8.comparators;

import com.arquitecturajava.java8.Person;
import java.util.Comparator;

public class PersonSurnameComparator implements Comparator<Person>{

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getSurname().compareTo(person2.getSurname());
    }
}