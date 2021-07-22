package com.arquitecturajava.sql.book;

class Author {

    private String pk_id;
    private String name;
    private int age;

    Author(String id, String name, int age) {
        this.pk_id = id;
        this.name = name;
        this.age = age;
    }

    Author(String name) {
        this.name = name;
    }

    String getPk_id() {
        return this.pk_id;
    }

    void setPk_id(String pk_id) {
        this.pk_id = pk_id;
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

    @Override
    public String toString() {
        return "[" + this.pk_id + "] " + this.name + " tiene " + this.age + " años.";
    }
}