/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq8;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println("ABC1");
            int i = 0;
            float t;
            t = 1 / i;
            System.out.println("ABC2");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
        System.out.println("last");
    }
}
