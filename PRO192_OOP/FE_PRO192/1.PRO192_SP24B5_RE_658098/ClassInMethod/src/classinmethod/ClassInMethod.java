/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classinmethod;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class ClassInMethod {

    public void someMethod() {
        final int finalVar = 10;
        int effectivelyFinalVar = 20;
        int nonFinalVar = 30;
        
        nonFinalVar = 40;

        class LocalInnerClass {
            public void printVars() {
                System.out.println(finalVar); // Allowed
                System.out.println(effectivelyFinalVar); // Allowed
//                System.out.println(nonFinalVar); // Not allowed when changing the value of var, would cause a compile error
            }
        }
        
        LocalInnerClass lic = new LocalInnerClass();
        lic.printVars();
    }

    public static void main(String[] args) {
        ClassInMethod cm = new ClassInMethod();
        cm.someMethod();
    }
}
