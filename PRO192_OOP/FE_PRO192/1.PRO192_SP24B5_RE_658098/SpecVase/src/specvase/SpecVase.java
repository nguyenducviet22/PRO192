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
public class SpecVase extends Vase {

    int type;

    SpecVase() {
    }

    SpecVase(String color, int price, int type) {
//        this.type = type;
        super(color, price);//super must go first
        this.type = type;
    }

    void display() {
//        String s = "(" + super.toString() + "," + type + ") ";
        String str = color + ", " + price + ", " + type;
//        System.out.println(s);
        System.out.println(str);
    }

    public static void main(String[] args) {
        SpecVase x = new SpecVase();
        SpecVase y = new SpecVase("Hoa", 20, 10);
        x.display();
        y.display();
        System.out.println();
    }
}
