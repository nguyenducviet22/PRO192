/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author NGUYEN DUC VIET
 */
//Q12
public class MainQ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "ABC$PQUV";
        int k = x.indexOf("$");
        String y = x.substring(0, k);
        String z = new String(new char[]{'A', 'B', 'C'});
        System.out.print(y + " ");
        System.out.println(y.equals(z));
    }
    
}
