package com.arquitecturajava.poo.person;

public class Calification {

    private String subject;
    private int value;

    Calification(String subject, int value) {
        this.setSubject(subject);
        this.setValue(value);
    }

    String getSubject() {
        return this.subject;
    }

    void setSubject(String subject) {
        this.subject = subject;
    }

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.getSubject() + ": " + this.getValue();
    }
}