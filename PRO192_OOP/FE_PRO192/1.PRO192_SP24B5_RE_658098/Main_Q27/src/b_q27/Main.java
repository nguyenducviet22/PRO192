/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_q27;

interface A {
    void foo();
    void fun();
}

class B implements A {
    @Override
//    void foo() { must declare public
    public void foo() {
        System.out.print("B1");
    }

//    void fun() {
    public void fun() {
        System.out.println("B2");
    }
}

class Main {
    public static void main(String[] args) {
        A t = new B();
        t.foo();
        t.fun();
    }
}
