/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myoverq3;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base {

    public Base(int i) {
    }
}

public class MyOverQ3 extends Base {

    MyOverQ3(int i) {
        super(i);
    }

    MyOverQ3(String s, int i) {
        this(i);
//        MyOverQ3 m = new MyOverQ3();// do not have this Constructor
//        super();// must call first in Constructor
//        this("Hello", 10);// must call first in Constructor
        Base b = new Base(10);
    }

    public static void main(String[] args) {
        MyOverQ3 m = new MyOverQ3(10);
    }
}
