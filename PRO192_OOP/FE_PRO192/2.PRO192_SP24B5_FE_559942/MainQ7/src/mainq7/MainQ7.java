/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq7;

/**
 *
 * @author NGUYEN DUC VIET
 */
abstract class A {

    int x = 5;

    void foo() {
        System.out.println(x);
    }
}

class B extends A {

    int y = 7;

    void foo() {
        System.out.println(x + y);
    }
}

public class MainQ7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A t = new B();
        t.foo();
    }
}
