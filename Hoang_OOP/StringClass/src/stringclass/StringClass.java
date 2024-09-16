/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringclass;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StringClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        createString();
    }
    
    public static void createString() {
        String s1 = new String("Hello");
        String s2 = "Hello";
        
        if (s1 == s2) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 does not equal s2");
        }
    }
    
}
