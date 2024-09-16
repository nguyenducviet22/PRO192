/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specvase;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Vase {
    String color;
    protected int price;

    Vase() {
    }

    Vase(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return (color + "," + price);
    }
}
