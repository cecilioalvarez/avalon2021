package com.arquitecturajava.poo.bill;

public class Bill_Main {

    public static void main(String[] args) {
        Bill bill1 = new Bill("Pedido de material", 359.99);
        System.out.printf("El precio de la factura nº " + bill1.getId() + " con concepto «" + bill1.getConcept() + "» es de %.2f € sin IVA.\n", bill1.getPrice());
        System.out.printf("Si sumamos el IVA el importe asciene a %.2f €.\n", bill1.getPriceIncludingVAT());
        double discount = 20;
        System.out.printf("Si aplicamos un descuento del %.2f %% se queda en %.2f €.\n", discount, bill1.getPriceWithDiscount(discount));
    }
}