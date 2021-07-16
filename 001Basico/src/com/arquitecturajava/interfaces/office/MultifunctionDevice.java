package com.arquitecturajava.interfaces.office;

class MultifunctionDevice implements Copier, Printer, Scanner {

    @Override
    public String copy() {
        return "El dispositivo multifunción copia.";
    }

    @Override
    public String print() {
        return "El dispositivo multifunción imprime.";
    }

    @Override
    public String scan() {
        return "El dispositivo multifunción escanea.";
    }

}