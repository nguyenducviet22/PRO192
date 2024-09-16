/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq8;

/**
 *
 * @author NGUYEN DUC VIET
 */
interface A {

    public void method();
}

class One {

    public void method() {
        System.out.println("Class One");
    }
}

class Two extends One implements A {

    public void method() {
        System.out.println("Class Two");
    }
}

public class MainQ8 extends Two {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A a = new Two();
        a.method();
    }
}
