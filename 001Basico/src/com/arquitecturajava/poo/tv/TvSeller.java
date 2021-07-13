package com.arquitecturajava.poo.tv;

public class TvSeller {
    
    private TV tv;

    private TvSeller(TV tv) {
        this.tv = tv;
    }
    
    private void setTv(TV tv) {
        this.tv = tv;
    }
    
    private void playWithPrice() {
        System.out.printf("El televisor de la marca " + this.tv.getBrand() + " costaba %.2f €.\n", this.tv.getPrice());
        this.tv.setPrice(849.99);
        System.out.printf("El televisor de la marca " + this.tv.getBrand() + " ahora cuesta %.2f €.\n", this.tv.getPrice());
        System.out.printf("El IVA –ya incluido– del televisor de la marca " + this.tv.getBrand() + " con el nuevo precio son %.2f €.\n", this.tv.getVAT());
    }
    
    private void playWithConnection() {
        System.out.println("El televisor de la marca " + this.tv.getBrand() + " estaba " + (this.tv.isOn() ? "encendido." : "apagado."));
        this.tv.setOn(false);
        System.out.println("El televisor de la marca " + this.tv.getBrand() + " ahora está " + (this.tv.isOn() ? "encendido." : "apagado."));
    }
    
    public static void main(String[] args) {
        TvSeller seller = new TvSeller(new TV("Philips", 359.99, false));
        seller.playWithPrice();
        seller.setTv(new TV("LG", 429.99, true));
        seller.playWithConnection();
    }
}