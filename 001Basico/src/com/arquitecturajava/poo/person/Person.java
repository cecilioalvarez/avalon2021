package com.arquitecturajava.poo.person;

import java.util.ArrayList;
import java.util.Iterator;

class Person {
    
    private static final int RETIREMENT_AGE = 65;
    private static final int LEGAL_AGE = 18;

    private String name;
    private int age;
    private Phone phone;
    private Gender gender;
    private Pet pet;
    private ArrayList<Calification> califications;
    
    Person() {
        this.setName("Anónimo");
        this.setAge(0);
        this.setPhone(null);
        this.setPet(null);
        this.setGender(Gender.OTHER);
        this.setCalifications(new ArrayList<>());
    }

    Person(String name, int age, Phone phone, Pet pet, Gender gender) {
        this.setName(name);
        this.setAge(age);
        this.setPhone(phone);
        this.setPet(pet);
        this.setGender(gender);
        this.setCalifications(new ArrayList<>());
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

    ArrayList<Calification> getCalifications() {
        return this.califications;
    }

    void setCalifications(ArrayList<Calification> califications) {
        this.califications = califications;
    }
    
    void addCalification(Calification calification) {
        this.califications.add(calification);
    }
    
    void removeCalification(int index) {
        this.califications.remove(index);
    }
    
    Calification getHighestCalification(String subject) {
        Calification highestCalification = null;
        for (Calification calification : this.califications) {
            if (calification.getSubject().equalsIgnoreCase(subject)) {
                if (highestCalification == null || calification.getValue() > highestCalification.getValue()) {
                    highestCalification = calification;
                }
            }
        }
        return highestCalification;
    }
    
    void removeCalification(String subject) {
        Iterator<Calification> iterator = this.califications.iterator();
        while (iterator.hasNext()) {
            Calification calification = iterator.next();
            if (calification.getSubject().equalsIgnoreCase(subject)) {
                iterator.remove();
            }
        }
    }
    
    CalificationsResume getCalificationsResume() {
        if (this.getCalifications().isEmpty()) {
            return null;
        } else {
            int califications_count = 0, califications_sum = 0;
            ArrayList<Calification> highest_califications = new ArrayList<>();

            for (Calification calification : this.getCalifications()) {
                califications_count++;
                califications_sum += calification.getValue();
                if (highest_califications.isEmpty()) {
                    highest_califications.add(calification);
                } else {
                    if (calification.getValue() > highest_califications.get(0).getValue()) {
                        highest_califications.clear();
                        highest_califications.add(calification);
                    } else if (calification.getValue() == highest_califications.get(0).getValue()) {
                        highest_califications.add(calification);
                    }
                }
            }
            return new CalificationsResume(califications_count, (califications_sum/califications_count), highest_califications);
        }
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
                + (this.getPhone() == null ? "No tiene teléfono. " : "Tiene un teléfono " + this.getPhone().toString() + ". ")
                + (this.getPet() == null ? "No tiene mascota." : this.getPet().toString())
                + (this.isAdult() ? " Es" : " No es") + " mayor de edad y "
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
    
    class CalificationsResume {
        
        private int califications_count;
        private int califications_average;
        private ArrayList<Calification> highest_califications;

        public CalificationsResume(int califications_count, int califications_average, ArrayList<Calification> highest_califications) {
            this.setCalifications_count(califications_count);
            this.setCalifications_average(califications_average);
            this.setHighest_califications(highest_califications);
        }

        public int getCalifications_count() {
            return this.califications_count;
        }

        public void setCalifications_count(int califications_count) {
            this.califications_count = califications_count;
        }

        public int getCalifications_average() {
            return this.califications_average;
        }

        public void setCalifications_average(int califications_average) {
            this.califications_average = califications_average;
        }

        public ArrayList<Calification> getHighest_califications() {
            return this.highest_califications;
        }

        public void setHighest_califications(ArrayList<Calification> highest_califications) {
            this.highest_califications = highest_califications;
        }

        @Override
        public String toString() {
            return "tiene " + this.getCalifications_count() + " notas registradas y una media de " + this.getCalifications_average()
                    + ". Su(s) nota(s) más alta(s) es/son " + this.getHighest_califications().toString() + ".";
        }
    }
}