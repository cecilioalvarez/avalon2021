package com.arquitecturajava;

class Person {

    private String name;
    private int age;
    private static final int RETIREMENT_AGE = 65;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    boolean isRetired() {
        return this.age >= RETIREMENT_AGE;
    }
}
