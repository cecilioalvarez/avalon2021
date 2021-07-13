package com.arquitecturajava.poo;

class Person {
    
    private static final int RETIREMENT_AGE = 65;
    private static final int LEGAL_AGE = 18;

    private String name;
    private int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    boolean isAdult() {
        return this.age >= LEGAL_AGE;
    }
    
    boolean isRetired() {
        return this.age >= RETIREMENT_AGE;
    }

    @Override
    public String toString() {
        return "La persona se llama " + this.name + " y tiene " + this.age + " años.";
    }
}