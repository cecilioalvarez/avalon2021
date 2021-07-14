package com.arquitecturajava.poo.person;

class Person {
    
    private static final int RETIREMENT_AGE = 65;
    private static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private Phone phone;
    private Gender gender;
    private Pet pet;

    Person() {
        this.setName("Anónimo");
        this.setAge(0);
        this.setPhone(new Phone());
        this.setPet(null);
        this.setGender(Gender.OTHER);
    }

    Person(String name, int age, Phone phone, Pet pet, Gender gender) {
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
        this.setPet(pet);
        this.setGender(gender);
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    Phone getPhone() {
        return this.phone;
    }

    void setPhone(Phone phone) {
        this.phone = phone;
    }

    Gender getGender() {
        return this.gender;
    }

    void setGender(Gender gender) {
        this.gender = gender;
    }

    Pet getPet() {
        return this.pet;
    }

    void setPet(Pet pet) {
        this.pet = pet;
    }
    
    boolean isAdult() {
        return this.getAge() >= LEGAL_AGE;
    }
    
    boolean isRetired() {
        return this.getAge() >= RETIREMENT_AGE;
    }

    @Override
    public String toString() {
        String string = this.getName() + " tiene " + this.getAge() + " años. "
                + "Tiene un teléfono " + this.getPhone().toString() + ". "
                + (this.getPet() == null ? "No tiene mascota. " : "Su mascota se llama " + this.getPet().getName() + ". ")
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