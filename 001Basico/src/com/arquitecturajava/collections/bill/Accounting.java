package com.arquitecturajava.collections.bill;

import java.util.ArrayList;
import java.util.Arrays;

class Accounting {
    
    private final ArrayList<Bill> BILLS = new ArrayList<>();
    
    private void addBills(Bill ...bills) {
        this.BILLS.addAll(Arrays.asList(bills));
    }

    private void showBillsInfo() {
        this.BILLS.forEach(bill -> {
            System.out.println("A continuación se muestran las líneas de detalle de la factura nº " + bill.getID() + " con concepto " + bill.getCONCEPT() + ":");
            bill.getDetails().forEach(detail -> System.out.println(detail.toString()));
            System.out.println();
        });
    }
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        Bill bill1 = new Bill("Compra de material escolar");
        BillDetail bill1_detail1 = new BillDetail(1, "Bolígrafos", 2.99);
        BillDetail bill1_detail2 = new BillDetail(2, "Cuadernos", 35.99);
        BillDetail bill1_detail3 = new BillDetail(3, "Lapiceros", 1.99);
        bill1.addDetail(bill1_detail1, bill1_detail2, bill1_detail3);
        
        Bill bill2 = new Bill("Compra de material de oficina");
        BillDetail bill2_detail1 = new BillDetail(1, "Grapas", 3.49);
        BillDetail bill2_detail2 = new BillDetail(2, "Clips", 2.29);
        BillDetail bill2_detail3 = new BillDetail(3, "Fundas A4", 1.19);
        bill2.addDetail(bill2_detail1, bill2_detail2, bill2_detail3);
        
        accounting.addBills(bill1, bill2);
        accounting.showBillsInfo();
    }
}