/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq43;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1 = "abc" + "def";
        String s2 = new String(s1);
        if (s1 == s2){
            System.out.println("==");
        } 
        if (s1.equals(s2)){
            System.out.println("equals");
        }
    }
    
}
