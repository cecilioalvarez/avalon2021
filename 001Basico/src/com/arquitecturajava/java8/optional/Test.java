package com.arquitecturajava.java8.optional;

import com.arquitecturajava.java8.Person;
import java.util.Optional;

class Test {
    
    private final Service SERVICE = new Service();

    public static void main(String[] args) {
        Test test = new Test();
        test.SERVICE.addPerson(
                new Person("Andrea", "Antúnez Arias", 16), 
                new Person("Blas", "Bernardo Blanco", 32), 
                new Person("Carmen", "Castro Ceballos", 47), 
                new Person("Davinia", "Donés Díaz", 21), 
                new Person("Ernesto", "Elías Esteban", 24), 
                new Person("Fiona", "Fernández Fuertes", 30)
        );
        
        Person searchedPerson = new Person("Davinia", "Donés Díaz", 45);
        System.out.println("A continuación se buscará la siguiente persona: " + searchedPerson.toString());
        Optional<Person> optional = test.SERVICE.findPerson(searchedPerson);
        System.out.println(optional.isPresent() ? "Se encontró la persona: " + optional.get().toString() : "No se encontró la persona.");
    }
}