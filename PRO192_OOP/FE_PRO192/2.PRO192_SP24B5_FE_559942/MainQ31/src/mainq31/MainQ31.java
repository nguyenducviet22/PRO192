/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq31;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        int a, b, c, d;
        s = "Foolish boy.";
        a = s.indexOf("fool");//indexOf() distinguish Upper/Lower case
        System.out.println(a);
        b = s.indexOf("Fool");
        System.out.println(b);
        c = s.indexOf("boy");
        System.out.println(c);
        d = s.indexOf("lish");
        System.out.println(d);
    }
}
