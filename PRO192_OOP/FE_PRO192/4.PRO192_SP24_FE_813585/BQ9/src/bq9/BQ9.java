/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bq9;

/**
 *
 * @author NGUYEN DUC VIET
 */
abstract class A {

    public A() {
        System.out.println("Dad");
    }

    public void out(){
        System.out.println("Dad loves son");
    }
}

class B extends A {

    public B() {
        System.out.println("Son");
    }

    @Override
    public void out() {
        System.out.println("Son loves dad");
    }
}

public class BQ9 {

    public static void main(String[] args) {
        A b = new B();
        b.out();//out() in B Class called
    }
}
