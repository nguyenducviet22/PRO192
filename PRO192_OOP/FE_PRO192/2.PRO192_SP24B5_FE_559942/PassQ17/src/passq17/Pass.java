/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passq17;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Pass {

    void doStuff(int x) {
        System.out.println("doStuff x = " + x++);//print x before incresing
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 5;
        Pass p = new Pass();
        p.doStuff(x);
        System.out.println(" main x = " + x);
    }
}
