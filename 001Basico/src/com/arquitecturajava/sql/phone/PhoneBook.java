package com.arquitecturajava.sql.phone;

import java.util.Arrays;
import java.util.List;

class PhoneBook {
    
    private static void insertPhones(Phone ...phones) {
        Arrays.asList(phones).forEach(phone -> new PhoneRepositoryJDBC().insert(phone));
    }
    
    private static void showAllPhones() {
        System.out.println("A continuación se muestra el listado completo de registros en la tabla Teléfono:");
        List<Phone> phones = new PhoneRepositoryJDBC().select();
        phones.forEach(phone -> System.out.println(phone.toString()));
    }
    
    private static void showPhonesFilteringBrand(String brand) {
        System.out.println("A continuación se muestra el listado de registros en la tabla Teléfono con marca «" + brand + "»:");
        List<Phone> phones = new PhoneRepositoryJDBC().select(brand);
        phones.forEach(phone -> System.out.println(phone.toString()));
    }

    public static void main(String[] args) {
        PhoneBook.insertPhones(
                new Phone(600000123, "Realme", 235.99),
                new Phone("HTC"), 
                new Phone("LG"),
                new Phone("Samsung"), 
                new Phone("Oppo"),
                new Phone("Elephone"),
                new Phone("Nokia"),
                new Phone("Motorola"),
                new Phone("Xiaomi"), 
                new Phone("Redmi"), 
                new Phone("Huawei"), 
                new Phone("Honor"),
                new Phone("OnePlus")
        );
        
        PhoneBook.showAllPhones();
        PhoneBook.showPhonesFilteringBrand("Samsung");
        
        PhoneRepository repository = new PhoneRepositoryJDBC();
        Phone searchedPhone = new Phone(600000123);
        searchedPhone = repository.select(searchedPhone);
        System.out.println("El teléfono buscado es:\t" + searchedPhone.toString());
        repository.updateBrand(searchedPhone, "Apple");
        searchedPhone = repository.select(searchedPhone);
        System.out.println("Cambiamos la marca:\t" + searchedPhone.toString());
        repository.updatePrice(searchedPhone, 999.99);
        searchedPhone = repository.select(searchedPhone);
        System.out.println("Cambiamos el precio:\t" + searchedPhone.toString());
        repository.delete(searchedPhone);
        System.out.print("Lo eliminamos. ");
        PhoneBook.showAllPhones();
    }
}