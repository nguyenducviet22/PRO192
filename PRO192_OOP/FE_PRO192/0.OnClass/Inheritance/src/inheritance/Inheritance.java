/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import a.B;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Inheritance {

    public static class C {
        String nameC;
        public int ageC;
        private double gpaC;
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
////        Q2
//        int arr[] = new int[5];
//        System.out.print(arr);
////        Q6
//        byte b = 50;
//        b = (byte) (b * 50);
////        Q7
//        System.out.println( "Hello" + args[0] ); 
////        Q8
//        int arr[] = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int n = 6;
//        n = arr[arr[n] / 2];
//        System.out.println(arr[n] / 2);

        System.out.println(c.ageC + c.nameC + c.gpaC);
        System.out.println(a.ageA + a.nameA);
        System.out.println(b.ageB);
    }
}
