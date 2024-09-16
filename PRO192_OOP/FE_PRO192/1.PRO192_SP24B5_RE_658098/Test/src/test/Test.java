/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author NGUYEN DUC VIET
 */
//Q10
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object ob1 = new Object();
        Object ob2 = ob1;
        if (ob1.equals(ob2)) {
            System.out.println("ob1 equals ob2");
        }
        if (ob1 == ob2) {
            System.out.println("ob1==ob2");
        }
        System.out.println("Have a nice day!");
    }
    
}
