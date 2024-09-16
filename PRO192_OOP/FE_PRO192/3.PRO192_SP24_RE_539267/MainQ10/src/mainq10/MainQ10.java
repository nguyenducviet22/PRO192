/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq10;

/**
 *
 * @author NGUYEN DUC VIET
 */
abstract class A {

    void fun() {
        System.out.println("fun");
    }

    final void foo() {
        System.out.println("foo");
    }
}

class B extends A {

    void fun() {
        System.out.println("B");
    }
//    final void foo(){// foo() is a final method, so cannot override
//        System.out.println("BB");
//    }
}

public class MainQ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A t = new B();
        t.fun();
        t.foo();
        System.out.println();
    }
}
