package com.arquitecturajava.collections.employees;

import com.arquitecturajava.collections.employees.ext.IOHelper;
import java.util.HashMap;
import java.util.Map.Entry;

class Enterprise {

    private final HashMap<String, Worker> EMPLOYEES = new HashMap<>();
    
    private void addEmployee(String id, Worker person) {
        this.EMPLOYEES.put(id, person);
    }
    
    private void showEmployeeData() {
        System.out.println("A continuación se muestran los datos de todos los empleados de la empresa:.");
        this.EMPLOYEES.entrySet().forEach(employee -> System.out.println("[" + employee.getKey() + "] " + employee.getValue().toString()));
    }
    
    private void showEmployeeData(String key) {
        if (this.EMPLOYEES.containsKey(key.toUpperCase())) {
            System.out.println("[" + key.toUpperCase() + "] " + this.EMPLOYEES.get(key.toUpperCase()).toString());
        } else {
            System.out.println("El NIF buscado no existe en la empresa.");
        }
    }
    
    private String searchEmployee() {
        System.out.println("A continuación se buscará al empleado con el NIF especificado:");
        return IOHelper.askForString("el NIF", 9, 9);
    }
    
    private void showAverageAge() {
        if (this.EMPLOYEES.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            int ageSum = 0;
            for (Entry<String, Worker> entry : this.EMPLOYEES.entrySet()) {
                ageSum += entry.getValue().getAge();
            }
            float avgAge = (float) ageSum / this.EMPLOYEES.size();
            System.out.println("La edad media de los empleados es de " + String.format("%,.2f", avgAge) + " años.");
        }
    }
    
    private void showMaxAge() {
        if (this.EMPLOYEES.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            int maxAge = 0;
            String keyMaxAge = null;
            for (Entry<String, Worker> entry : this.EMPLOYEES.entrySet()) {
                if (entry.getValue().getAge() > maxAge) {
                    maxAge = entry.getValue().getAge();
                    keyMaxAge = entry.getKey();
                }
            }
            System.out.println("El empleado con mayor edad es: [" + keyMaxAge + "] " + this.EMPLOYEES.get(keyMaxAge).toString());
        }
    }
    
    public static void main(String[] args) {
        Enterprise enterprise = new Enterprise();
        enterprise.addEmployee("00000000T", new Worker("Alberto", 45));
        enterprise.addEmployee("11111111H", new Worker("Juana", 58));
        enterprise.addEmployee("22222222J", new Worker("Nuria", 33));
        enterprise.addEmployee("33333333P", new Worker("Alba", 24));
        enterprise.addEmployee("44444444A", new Worker("Carlo", 39));
        enterprise.showEmployeeData();
        enterprise.showEmployeeData(enterprise.searchEmployee());
        enterprise.showMaxAge();
        enterprise.showAverageAge();
    }
}