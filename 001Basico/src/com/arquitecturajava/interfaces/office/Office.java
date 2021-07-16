package com.arquitecturajava.interfaces.office;

import java.util.ArrayList;
import java.util.Collections;


class Office {
    
    private static ArrayList<Copier> copierDevices = new ArrayList<>();
    private static ArrayList<Printer> printerDevices = new ArrayList<>();
    private static ArrayList<Scanner> scannerDevices = new ArrayList<>();
    
    private static void showCopierDevices() {
        Office.copierDevices.forEach(copier -> System.out.println(copier.copy()));
    }
    
    private static void showPrinterDevices() {
        Office.printerDevices.forEach(printer -> System.out.println(printer.print()));
    }
    
    private static void showScannerDevices() {
        Office.scannerDevices.forEach(scanner -> System.out.println(scanner.scan()));
    }

    public static void main(String[] args) {
        CopierDevice copierDevice = new CopierDevice();
        PrinterDevice printerDevice = new PrinterDevice();
        MultifunctionDevice multifunctionDevice = new MultifunctionDevice();
        
        Collections.addAll(scannerDevices, multifunctionDevice);
        Collections.addAll(copierDevices, copierDevice, multifunctionDevice);
        Collections.addAll(printerDevices, printerDevice, copierDevice, multifunctionDevice);
        
        Office.showScannerDevices();
        Office.showCopierDevices();
        Office.showPrinterDevices();
    }
}