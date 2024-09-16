/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainq13;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MainQ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(12);
        t.add(2);
        t.add(4);
        t.add(2);
        Iterator<Integer> i = t.iterator();
        int sum = 0;
        while (i.hasNext()) {
            sum += i.next();
        }
        System.out.println(sum);
    }
    
}
