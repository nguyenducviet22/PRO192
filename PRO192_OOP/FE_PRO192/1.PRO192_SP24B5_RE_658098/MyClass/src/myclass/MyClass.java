/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclass;
/**
 *
 * @author NGUYEN DUC VIET
 */
//Q8
public class MyClass implements MyInterface{

    public void doSomething() {
        System.out.println("Doing something");
    }
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        MyInterface myInterfaceReference = myObject; // Valid cast
        myInterfaceReference.doSomething();
    }
    
}
