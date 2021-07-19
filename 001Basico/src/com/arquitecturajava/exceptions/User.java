package com.arquitecturajava.exceptions;

import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.GregorianCalendar;

class User {

    private final String NAME;
    private final Calendar BIRTHDAY;
    
    private User(String name, Calendar birthday) {
        this.NAME = name;
        this.BIRTHDAY = birthday;
    }
    
    private void showUserData() {
        SimpleDateFormat sdf = new SimpleDateFormat( "dd/MM/YYYY");
        System.out.println("Tu nombre es " + this.NAME + " y naciste el " + sdf.format(this.BIRTHDAY.getTime()) + ".");
    }

    public static void main(String[] args) {
        String name = null;
        try {
            name = IOHelper.askForString("tu nombre", 3, 30);
        } catch (StringLengthValidationException str_ex) {
            System.out.println(str_ex.getMessage());
        } 
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int birthYear = IOHelper.askForInteger("tu año de nacimiento", 1910, currentYear);
        int birthMonth = IOHelper.askForInteger("tu mes de nacimiento", 1, 12) -1;
        int birthDayOfMonth = IOHelper.askForInteger("tu día de nacimiento", 1, YearMonth.of(birthYear, birthMonth).lengthOfMonth());
        
        User user = new User(name, new GregorianCalendar(birthYear, birthMonth, birthDayOfMonth));
        user.showUserData();
    }
}