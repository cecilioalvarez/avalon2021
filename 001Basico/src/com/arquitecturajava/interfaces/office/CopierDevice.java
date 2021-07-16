package com.arquitecturajava.interfaces.office;

class CopierDevice implements Copier, Printer {

    @Override
    public String copy() {
        return "La multicopiadora copia.";
    }

    @Override
    public String print() {
        return "La multicopiadora imprime.";
    }
}