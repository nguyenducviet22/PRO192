/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int a, b;
            b = 1;
            a = 5 / 1;
            System.out.print("A");
        } catch (ArithmeticException e) {
            System.out.print("B");
        }
    }

}
