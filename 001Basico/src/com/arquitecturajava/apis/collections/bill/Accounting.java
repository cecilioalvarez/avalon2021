package com.arquitecturajava.apis.collections.bill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Accounting {
    
    private final List<Bill> BILLS = new ArrayList<>();
    
    private void addBills(Bill ...bills) {
        this.BILLS.addAll(Arrays.asList(bills));
    }
    
    private void addBillDetails(BillDetail ...billDetails) {
        Arrays.asList(billDetails).forEach(billDetail ->  this.BILLS.get(billDetail.getBill().getID() - 1).addDetail(billDetail));
    }

    private void showBillsInfo() {
        this.BILLS.forEach(bill -> {
            System.out.println("A continuación se muestran las líneas de detalle de la factura nº " + bill.getID() + " con concepto «" + bill.getCONCEPT() + "»:");
            bill.getDetails().forEach(detail -> System.out.println(detail.toString()));
            System.out.println();
        });
    }
    
    private void showBillDetail(int billId, int detailId) {
        System.out.println("A continuación se muestra el detalle nº " + detailId + " de la factura nº " + billId + ":\n" 
                + this.BILLS.get(billId - 1).getDetails().get(detailId - 1));
    }
    
    public static void main(String[] args) {
        Accounting accounting = new Accounting();
        Bill bill1 = new Bill("Compra de material escolar");
        Bill bill2 = new Bill("Compra de material de oficina");
        accounting.addBills(bill1, bill2);
        
        BillDetail bill1_detail1 = new BillDetail("Bolígrafos", 2.39f, bill1);
        BillDetail bill1_detail2 = new BillDetail("Cuadernos", 35.99f, bill1);
        BillDetail bill1_detail3 = new BillDetail("Lapiceros", 1.99f, bill1);
        BillDetail bill2_detail1 = new BillDetail("Grapas", 3.49f, bill2);
        BillDetail bill2_detail2 = new BillDetail("Cajoneras", 489.99f, bill2);
        BillDetail bill2_detail3 = new BillDetail("Fundas A4", 1.19f, bill2);
        accounting.addBillDetails(bill1_detail1, bill1_detail2, bill1_detail3, bill2_detail1, bill2_detail2, bill2_detail3);
        
        accounting.showBillsInfo();
        accounting.showBillDetail(2, 1);
    }
}