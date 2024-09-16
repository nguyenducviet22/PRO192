/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

//Q19
//final class A {
class A {
     int i;
}
class B extends A { //can not extends from a final Class
    int j;
    System.out.println(j + " " + i);
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
    
}
