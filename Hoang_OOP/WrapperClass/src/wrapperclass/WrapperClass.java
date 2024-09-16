/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclass;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class WrapperClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        createIntegerObj();
//        createPoiter();
        createPool();
    }
    
    public static void createPool() {
        Integer n1 = 2004;
        Integer n2 = 2004;
        Integer n3 = new Integer(2004);
        
        if (n1 == n2) {
            System.out.println("n1 equals n2");
        } else {
            System.out.println("n1 does not equal n2");
        }
        //new ngầm [-128, 127] thì vùng new Integer() là vùng new xài chung trong obj
        
        
        Integer n4 = 100;
        Integer n5 = 100;
        Integer n6 = new Integer(100);
        
        if (n4 == n5) {
            System.out.println("n4 equals n5");
        } else {
            System.out.println("n4 does not equal n5");
        }
    }   
    
    public static void createPoiter() {
        Integer n1 = 2004;
        Integer n2 = 2004;
        
        if (n1 == n2) {
            System.out.println("n1 equals n2.");
        } else {
            System.out.println("n1 does not equal n2.");
        }
        
        System.out.println("n1 equals n2: " + n1.equals(n2));
        System.out.println("n1 equals n2: " + n1.compareTo(n2));
    }
    
    public static void createIntegerObj() {
        int num1 = 2003;
        //Boxing
        Integer num2 = new Integer("2003");
        Integer num3 = 2003; //~ new Integer(2003);
        //Unboxing
        int num4 = num2;        
        
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
        System.out.println("Num3: " + num3);
        System.out.println("Num4: " + num4);
    }
    
}
