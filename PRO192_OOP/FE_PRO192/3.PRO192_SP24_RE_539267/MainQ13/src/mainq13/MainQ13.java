/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq13;

import java.io.IOException;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k = 5;
        try {
            if (k > 4) throw new IOException();
        } catch (IOException e) {
            System.out.println("one");
        } catch (Exception e) {
            System.out.println("two");
        } finally {
            System.out.println("three");
        }
        System.out.println();
    }
    
}
