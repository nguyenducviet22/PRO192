/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq12;

/**
 *
 * @author NGUYEN DUC VIET
 */
class A {

    void foo() {
        System.out.println("A");
    }
}

class B {

    void foo() {
        System.out.println("B");
    }
}

class C extends A {

    void foo() {
        System.out.println("C");
    }
}

public class MainQ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Object t = new A();
//        t.foo();// cannot call foo() cuz t does not have foo()
//        t = new B();
//        t.foo();
//        t = new C();
//        t.foo();
    }
}
