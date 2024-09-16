/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq35;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ35 {

    public static void foo(String str) {
        try {
            float x = Float.parseFloat(str);
        } catch (NumberFormatException e) {
            x = 0;// x var has not been declared
        } finally {
            System.out.println(x);// x var has not been declared
        }
    }

    public static void main(String[] args) {
        foo("invalid");
    }
}
