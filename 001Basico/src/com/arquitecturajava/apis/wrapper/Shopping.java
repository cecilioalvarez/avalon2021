package com.arquitecturajava.apis.wrapper;

class Shopping {

    private Bag<Product> products = new Bag<>();
    
    private void addProduct(Product product) {
        this.products.addObject(product);
    }
    
    private void showBag() {
        this.products.showList();
    }
    
    public static void main(String[] args) {
        Shopping shopping = new Shopping();
        shopping.addProduct(new Product("Galletas", 2.99));
        shopping.addProduct(new Product("Leche", 1));
        shopping.addProduct(new Product("Pescado", 6.99));
        shopping.addProduct(new Product("Desinfectante", 3.15));
        shopping.showBag();
    }
}