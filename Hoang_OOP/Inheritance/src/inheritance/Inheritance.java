/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

import data.Rectangle;
import data.RightTriangle;
import data.Round;
import data.Square;
import data.Triangle;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        cutShapes();
//        sortArea();
//        extendRectangle();
        extendTriangle();
        
        
    }
    
    public static void extendTriangle(){
        Triangle tri = new Triangle("Bro", "Green", 4, 5, 6);
        tri.showInfo();//bold color, Triangle-self
        RightTriangle rtri = new RightTriangle("Me", "Blue", 3, 4);
        rtri.showInfo();//light color, do not have this method in Class
        Triangle triRtri = new RightTriangle("Sis", "Pink", 6, 8);
        triRtri.showInfo();//bold color, inherited from Triangle
                
    }

    public static void extendRectangle(){
        Rectangle rec = new Rectangle("Dad", "Gray", 4, 5);
        rec.showInfo();//bold black => rectangle-self
        Square sq = new Square("Me", "Orange", 3);
        sq.showInfo();//light black => do not have this method in Class
        Rectangle recSq = new Square("Mom", "Blue", 4);
        recSq.showInfo();//bold black => square-self, inherited from SuperClass
    }
    
    public static void sortArea() {
        Rectangle[] recArr = new Rectangle[4];

        recArr[0] = new Rectangle("Dad", "Black", 2, 3);
        recArr[1] = new Rectangle("Mom", "Blue", 3, 4);
        recArr[2] = new Rectangle("Sis", "Red", 1, 4);
        
        recArr[3] = new Square("Bro", "Green", 6);
        
//        for (Rectangle rec : recArr) {
//            rec.showInfo();
//        }
        
        for (int i = 0; i < 4; i++) {
            recArr[i].showInfo();
        }
        
        for (int i = 0; i < 4 - 1; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (recArr[i].getArea() > recArr[j].getArea()) {
                    Rectangle t = recArr[i];
                    recArr[i] = recArr[j];
                    recArr[j] = t;
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            recArr[i].showInfo();
        }
    }
}
