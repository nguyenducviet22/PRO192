/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq39;

/**
 *
 * @author NGUYEN DUC VIET
 */
interface A{
    void foo();
    void fun();
}

class B implements A{

    @Override
    public void foo() {
//    void foo() {//must be declare as public
        System.out.println("B1");
    }

    @Override
    public void fun() {
//    void fun() {//must be declare as public
        System.out.println("B2");
    }
    
}
public class MainQ39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A t = new B();
        t.foo();
        t.fun();
    }
    
}