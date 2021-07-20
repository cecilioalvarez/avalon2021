package com.arquitecturajava.apis.collections.bill;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class CustomersAccounting {

    private final HashMap<String, List<Bill>> CUSTOMERS = new HashMap<>();
    
    private void addBills(String client, Bill ...bills) {
        if (this.CUSTOMERS.containsKey(client)) {
            this.CUSTOMERS.get(client).addAll(Arrays.asList(bills));
        } else {
            this.CUSTOMERS.putIfAbsent(client, Arrays.asList(bills));
        }
    }
    
    private void addBillDetails(Bill bill, BillDetail ...billDetails) {
        Arrays.asList(billDetails).forEach(billDetail ->  bill.addDetail(billDetail));
    }
    
    private void showBills() {
        this.CUSTOMERS.keySet().forEach(key -> this.showBills(key));
    }
    
    private void showBills(String client) {
        System.out.println("A continuación se muestran las facturas a nombre de "  + client + ":");
        this.CUSTOMERS.get(client).forEach(bill -> {
            System.out.println("A continuación se muestran las líneas de detalle de la factura nº " + bill.getID() + " con concepto «" + bill.getCONCEPT() + "»:");
            bill.getDetails().forEach(detail -> System.out.println(detail.toString()));
            System.out.println();
        });
    }
    
    public static void main(String[] args) {
        Bill bill1 = new Bill("Compra de material escolar");
        Bill bill2 = new Bill("Compra de material de oficina");
        Bill bill3 = new Bill("Compra de material decorativo");
        Bill bill4 = new Bill("Venta de mobiliario");
        
        BillDetail bill1_detail1 = new BillDetail("Bolígrafos", 2.39f, bill1);
        BillDetail bill1_detail2 = new BillDetail("Cuadernos", 35.99f, bill1);
        BillDetail bill1_detail3 = new BillDetail("Lapiceros", 1.99f, bill1);
        BillDetail bill2_detail1 = new BillDetail("Grapas", 3.49f, bill2);
        BillDetail bill2_detail2 = new BillDetail("Cajoneras", 489.99f, bill2);
        BillDetail bill2_detail3 = new BillDetail("Fundas A4", 1.19f, bill2);
        BillDetail bill3_detail1 = new BillDetail("Plantas", 10.55f, bill3);
        BillDetail bill3_detail2 = new BillDetail("Cuadros", 168f, bill2);
        BillDetail bill4_detail1 = new BillDetail("Sillas de oficina", -160f, bill3);
        BillDetail bill4_detail2 = new BillDetail("Elevadores de pies", -40.55f, bill2);
        BillDetail bill4_detail3 = new BillDetail("Atriles", -29.97f, bill2);
        BillDetail bill4_detail4 = new BillDetail("Lámparas", -59.99f, bill2);
        
        CustomersAccounting ca = new CustomersAccounting();
        ca.addBillDetails(bill1, bill1_detail1, bill1_detail2, bill1_detail3);
        ca.addBillDetails(bill2, bill2_detail1, bill2_detail2, bill2_detail3);
        ca.addBillDetails(bill3, bill3_detail1, bill3_detail2);
        ca.addBillDetails(bill4, bill4_detail1, bill4_detail2, bill4_detail3, bill4_detail4);
        ca.addBills("Manuel", bill1, bill2);
        ca.addBills("Coral", bill3);
        ca.addBills("Estela", bill4);
        ca.showBills();
    }
}