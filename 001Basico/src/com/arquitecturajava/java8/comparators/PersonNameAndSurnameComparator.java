package com.arquitecturajava.java8.comparators;

import com.arquitecturajava.java8.Person;
import java.util.Comparator;

public class PersonNameAndSurnameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        switch (person1.getSurname().compareTo(person2.getSurname())) {
            case 1:
                return 1;
            case -1:
                return -1;
            default:
                return person1.getName().compareTo(person2.getName());
        }
    }
}
