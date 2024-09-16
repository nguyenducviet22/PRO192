/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass_q40;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Box {

    int a, b, c;
}

public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box x = new Box();
        Box y;
        x.a = 2;
        x.b = 1;
        x.c = 3;
        y = x;
        System.out.println(y.a);
    }
}
