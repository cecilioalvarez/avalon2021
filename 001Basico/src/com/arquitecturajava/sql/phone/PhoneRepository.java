package com.arquitecturajava.sql.phone;

import java.util.List;

interface PhoneRepository {
    Phone select(Phone phone);
    List<Phone> select();
    List<Phone> select(String brand);
    List<Phone> select(double price);
    List<Phone> select(String brand, double price);
    int insert(Phone phone);
    int delete(Phone phone);
    int delete(String brand);
    int delete(double price);
    int update(Phone phone);
    int updateBrand(Phone phone, String newValue);
    int updatePrice(Phone phone, double newValue);
}