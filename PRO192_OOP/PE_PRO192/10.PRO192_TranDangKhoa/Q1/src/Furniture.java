/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Furniture {

    private int id;
    private String name;
    private double price;
    private int quantity;

    public Furniture() {
    }

    public Furniture(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSubTotal() {
        double subTotal = getQuantity() * getPrice();
        if (subTotal >= 50 && subTotal < 100){
            subTotal *= 0.9;
        } else {
            subTotal *= 0.8;
        }
        return subTotal;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f, %d, %.2f", id, name, price, quantity, getSubTotal());
    }

}
