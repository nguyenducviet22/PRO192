/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotq33;

/**
 *
 * @author NGUYEN DUC VIET
 */
class A {

    void doJob1() {
    }
}

class B extends A {

    void doJob2() {
    }
}

public class RobotQ33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b1 = new B();

        a1.doJob1();
//        ((B) a1).doJob2();//a1 cannot cast to B and call doJob2()
        a2.doJob1();//can call all methods in A Class
        ((B) a2).doJob2();//a2 has cated to B and call all methods in B Class
        b1.doJob1();
        b1.doJob2();
    }
}
