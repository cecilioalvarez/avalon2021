package com.arquitecturajava.sql.book;

class Author {

    private final String PK_ID;
    private String name;
    private int age;

    Author(String id, String name, int age) {
        this.PK_ID = id;
        this.name = name;
        this.age = age;
    }

    public String getPK_ID() {
        return PK_ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "[" + this.PK_ID + "] " + this.name + " tiene " + this.age + " años.";
    }
}