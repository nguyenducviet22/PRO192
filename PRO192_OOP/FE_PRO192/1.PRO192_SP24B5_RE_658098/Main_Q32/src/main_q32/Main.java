/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_q32;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Rectangle {

    int marks = 10;
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        switch (rec.marks) {
            default:
                System.out.println("A");
            case 10:
                System.out.println("B");
            case 100:
                System.out.println("C");
//            default: System.out.println("A");
        }
    }
}
