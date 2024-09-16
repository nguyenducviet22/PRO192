/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parentchildclass;

import data.Child;
import data.Parent;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class ParentChildClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        showParentAsset();
    }
    
    public static void showParentAsset(){
        Parent pa = new Parent("A Villa", 1000000000);
        pa.showProfile();
        Child ch1 = new Child("A House", 100000000, "a BMW");
        ch1.showProfile();
        ch1.sayHi();
//        Declare Parent Obj and create Child Obj
        Parent ch2 = new Child("A Building", 100000, "Vinfast");
//        ch2 trỏ lưng chừng
//        ch2.sayHi();do not have sayHi() method in Parent Class
        Child tmp = (Child)ch2;
//        tmp trỏ dáy new, ram
        tmp.sayHi();
        ((Child)ch2).sayHi();
    }
    
}
