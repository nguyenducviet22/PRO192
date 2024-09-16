/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq14;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int prime = 5;
        Integer wrapped = 10;
        prime = wrapped;
        wrapped = prime;
        prime = new Integer(9);
        wrapped = 9;
        System.out.println(prime);
        System.out.println(wrapped);
    }
}
