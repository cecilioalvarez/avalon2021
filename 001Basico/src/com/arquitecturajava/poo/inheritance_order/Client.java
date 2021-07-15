package com.arquitecturajava.poo.inheritance_order;

import java.util.ArrayList;

class Client {

    private ArrayList<Order> orders = new ArrayList<>();
    
    private void addOrder(Order order) {
        this.orders.add(order);
    }
    
    private void showOrders() {
        double totalPrice = 0;
        for (Order order : this.orders) {
            totalPrice += order.getDefinitivePrice();
        }
        System.out.printf("El importe total de las comandas asciende a %.2f €.\n", totalPrice);
    }
    
    public static void main(String[] args) {
        Client client = new Client();
        client.addOrder(new WebOrder(10));
        client.addOrder(new BarOrder(10));
        client.addOrder(new TableOrder(10));
        client.addOrder(new TableOrder(10));
        client.addOrder(new WebOrder(10));
        client.addOrder(new BarOrder(10));
        client.showOrders();
    }
}