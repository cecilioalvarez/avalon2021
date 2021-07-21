package com.arquitecturajava.sql.phone;

import java.util.List;

class Test {

    public static void main(String[] args) {
        new PhoneAR(new Phone("HTC")).insert();
        new PhoneAR(new Phone("LG")).insert();
        new PhoneAR(new Phone("ZTE")).insert();
        new PhoneAR(new Phone("Samsung")).insert();
        new PhoneAR(new Phone("Oppo")).insert();
        new PhoneAR(new Phone("Elephone")).insert();
        new PhoneAR(new Phone("Nokia")).insert();
        new PhoneAR(new Phone("Motorola")).insert();
        
        List<Phone> phones = new PhoneAR().selectAll();
        phones.forEach(phone -> System.out.println(phone.toString()));
        
        /*Phone searchedPhone = new Phone(633287915);
        PhoneAR searchedPhoneAr = new PhoneAR(searchedPhone);
        searchedPhoneAr.select();
        System.out.println("El teléfono buscado es:\t" + searchedPhoneAr.toString());
        searchedPhoneAr.updateBrand("iPHone");
        searchedPhoneAr.select();
        System.out.println("Le hemos cambiado la marca:\t" + searchedPhoneAr.toString());
        searchedPhoneAr.updatePrice(999.99);
        searchedPhoneAr.select();
        System.out.println("Le hemos cambiado el precio:\t" + searchedPhoneAr.toString());
        searchedPhoneAr.delete();*/
    }
}