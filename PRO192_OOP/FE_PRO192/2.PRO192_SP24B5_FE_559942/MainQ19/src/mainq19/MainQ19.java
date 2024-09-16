/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq19;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ19 {

    void f(String t){
        System.out.println("String");
    }
    void f(StringBuffer h){
        System.out.println("StringBuffer");
    }
    public static void main(String[] args) {
        f("ABC");//f ís non-static method
        MainQ19 m = new MainQ19();
        m.f("ABC");
        System.out.println();
    }
}
