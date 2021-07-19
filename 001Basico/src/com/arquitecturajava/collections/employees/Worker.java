package com.arquitecturajava.collections.employees;

class Worker {

    private String name;
    private int age;

    Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }    

    @Override
    public String toString() {
        return this.name + " tiene " + this.age + " años.";
    }
}