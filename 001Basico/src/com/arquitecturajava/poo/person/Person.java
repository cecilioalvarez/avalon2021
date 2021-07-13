package com.arquitecturajava.poo.person;

class Person {
    
    private static final int RETIREMENT_AGE = 65;
    private static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private Gender gender;

    Person() {
    }

    Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    boolean isAdult() {
        return this.age >= LEGAL_AGE;
    }
    
    boolean isRetired() {
        return this.age >= RETIREMENT_AGE;
    }

    @Override
    public String toString() {
        String string = this.getName() + " y tiene " + this.getAge() + " años. " 
                + (this.isAdult() ? "Es" : "No es") + " mayor de edad y "
                + (this.isRetired() ? "está" : "no está") + " jubilad";
        switch (this.getGender()) {
            case FEMALE:
                return string + "a.";
            case MALE:
                return string + "o.";
            case OTHER: default:
                return string + "e.";
        }
    }
}