/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedcollectionsframework;

import data.Cabinet;
import data.CabinetTest;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class AdvancedCollectionsFramework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
        CabinetTest se = new CabinetTest();
        
        System.out.println("Enter SE: ");
        se.addStudent();
        se.addStudent();
        
        System.out.println("SE students: ");
        se.printStudentList();
        
//        se.searchStudent();
        
        se.updateStudent();
    }
    
}
