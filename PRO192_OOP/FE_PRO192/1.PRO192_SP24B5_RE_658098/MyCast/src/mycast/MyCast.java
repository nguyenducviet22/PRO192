/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycast;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base {
}

public class MyCast extends Base {

    static boolean b1 = false;
    static int i = -1;
    static double d = 10.1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyCast m = new MyCast();
        Base b = new Base();
        b = m;
//        m = (MyCast) b;
        d = i;
//        i = (int) d;
//        b1 = i;
        System.out.println(b);
        System.out.println(d);
    }

}
