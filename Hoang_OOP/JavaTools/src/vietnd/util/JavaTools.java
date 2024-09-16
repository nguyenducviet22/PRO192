/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vietnd.util;

import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class JavaTools {
    public static final double PI = 3.1415;
    
    private static Scanner sc = new Scanner(System.in);
    public static int getAnInteger(String msg){
        int n;
        
        do {            
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Please enter again.");
            }
        } while (true);
    }
}
