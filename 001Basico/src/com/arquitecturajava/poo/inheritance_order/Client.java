package com.arquitecturajava.poo.inheritance_order;

import java.util.ArrayList;

class Client {

    private ArrayList<Order> orders = new ArrayList<>();
    private int orderCount = 0;
    private String name;

    private Client(String name) {
        this.name = name;
    }

    private String getName() {
        return name;
    }
    
    private void addOrder(Order order) {
        this.orderCount++;
        this.orders.add(order);
    }

    int getOrderCount() {
        return this.orderCount;
    }
    
    private void showOrdersTotalPrice() {
        double totalPrice = 0;
        for (Order order : this.orders) {
            totalPrice += order.getDefinitivePriceIncludingVipDiscount();
        }
        System.out.printf("El importe total de las comandas de " + this.getName() + " asciende a %.2f €.\n", totalPrice);
    }
    
    public static void main(String[] args) {
        Client client = new Client("Francisca");
        client.addOrder(new WebOrder(client, 10));
        client.addOrder(new BarOrder(client, 10));
        client.addOrder(new TableOrder(client, 10));
        client.addOrder(new TableOrder(client, 10));
        client.addOrder(new WebOrder(client, 10));
        client.addOrder(new BarOrder(client, 10));
        client.showOrdersTotalPrice();
    }
}