package com.arquitecturajava.apis.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

class MyCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DATE, 6);
        
        calendar.add(Calendar.MONTH, 5);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("La fecha es " + sdf.format(calendar.getTime()));
    }
}