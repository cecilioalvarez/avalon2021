package com.arquitecturajava.interfaces.office;

class PrinterDevice implements Printer {

    @Override
    public String print() {
        return "La impresora imprime";
    }
}
