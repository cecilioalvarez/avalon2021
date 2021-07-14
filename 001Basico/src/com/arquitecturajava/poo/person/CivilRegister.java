package com.arquitecturajava.poo.person;

class CivilRegister {
    
    private Person person;

    private CivilRegister(Person person) {
        this.setPerson(person);
    }

    private Person getPerson() {
        return person;
    }

    private void setPerson(Person person) {
        this.person = person;
    }

    private void showPersonData() {
        System.out.println(this.person.toString());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Manuel");
        person.setAge(17);
        person.setPet(new Pet("Calcetines", new Illness()));
        person.setGender(Gender.MALE);
        
        CivilRegister civilRegister = new CivilRegister(person);
        civilRegister.showPersonData();
        
        civilRegister.setPerson(new Person("Francisca", 89, new Phone(722597102, "Motorola"), new Pet("Toby", new Illness("Fibrosis", Extent.ACUTE)), Gender.FEMALE));
        civilRegister.showPersonData();
        
        civilRegister.setPerson(new Person("Andrea", 52, new Phone(654880307, "Sony"), null, Gender.OTHER));
        civilRegister.showPersonData();
    }
}