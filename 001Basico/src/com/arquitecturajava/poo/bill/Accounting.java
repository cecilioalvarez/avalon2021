package com.arquitecturajava.poo.bill;

class Accounting {
    
    private Bill bill;

    private Accounting(Bill bill) {
        this.bill = bill;
    }
    
    private void showBillRawData() {
        System.out.println(this.bill.toString());
    }
    
    private void showBillIncludingVAT() {
        System.out.printf("Si sumamos el IVA el importe asciene a %.2f €.\n", this.bill.getPriceIncludingVAT());
    }
    
    // Descuento por parámetro en porcentaje
    private void showBillPriceAplyingDiscount(double discount) {
        System.out.printf("Si aplicamos un descuento del %.2f %% el precio final se queda en %.2f €.\n", discount, this.bill.getPriceWithDiscount(discount));
    }

    public static void main(String[] args) {
        Accounting accounting = new Accounting(new Bill("Pedido de material", 359.99));
        accounting.showBillRawData();
        accounting.showBillIncludingVAT();
        accounting.showBillPriceAplyingDiscount(20);
    }
}