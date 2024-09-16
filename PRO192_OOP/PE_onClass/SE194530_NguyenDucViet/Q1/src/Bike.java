/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Bike {

    int id;
    String name;
    double price;

    public Bike() {
    }

    public Bike(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    String getName() {
        return name.toUpperCase();
    }

    double getSalePrice() {
        return price * 1.1;
    }

    @Override
    public String toString() {
        return "Bkie{" + "id=" + id + ", name=" + name + ", price=" + price + '}';
    }
}
