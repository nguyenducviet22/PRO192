/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testq42;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class TestQ42 {
    
    void foo(int i) {
        System.out.println("int version");
        System.out.println(i);
    }
    
    void foo(String s) {
        System.out.println("String version");
    }
    
    public static void main(String[] args) {
        TestQ42 t = new TestQ42();
        char c = 'p';
        t.foo(c);
    }
}
