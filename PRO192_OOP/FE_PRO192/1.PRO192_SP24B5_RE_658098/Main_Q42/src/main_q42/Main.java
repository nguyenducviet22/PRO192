/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_q42;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object ob = new Object();
        String[] str = new String[50];
        Float f = new Float(3.14f);
        
        ob = str;
        ob = str[5];
        f = ob;// must cast ob to Float as (Float) ob
        ob = f;
    }
    
}
