/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author NGUYEN DUC VIET
 */
//Q1
class Pen implements Comparable<Pen> {

    String color;
    int price;

    Pen(String color, int price) {
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return ("(" + color + "," + price + ") ");
    }

    public int compareTo(Pen x) {
        int k = color.compareTo(x.color);
        if (k != 0) {
            return (-k);
        }
        return (x.price - price);
    }

    public static void main(String[] args) {
        List<Pen> t = new ArrayList<>();
        t.add(new Pen("B", 3));
        t.add(new Pen("C", 4));
        t.add(new Pen("D", 7));
        t.add(new Pen("C", 5));
        t.add(new Pen("A", 6));
        t.add(new Pen("C", 6));
        t.add(new Pen("C", 3));
        Collections.sort(t);
        for (Pen x : t) {
            System.out.print(x);
        }
        System.out.println();
    }
}
