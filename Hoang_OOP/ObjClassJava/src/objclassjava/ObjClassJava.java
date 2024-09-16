package objclassjava;

import data.Students;

public class ObjClassJava {
    public static void main(String[] args) {
        // TODO code application logic here
        Students harryPotter = new Students("Harry Potter", 2004, 10.0);
        Students hermioneGranger = new Students("Hermione Granger", 2003, 9.5);
        harryPotter.studyDADA();
        hermioneGranger.studyTransfiguration();
        harryPotter.setNewGpa(9.8);
        harryPotter.studyPotions();
        
        int harryYob = harryPotter.getYob();
        System.out.println("Harry's YOB is " + harryYob);
        System.out.println("Hermione's YOB is " + hermioneGranger.getYob());
       
    }
    
}
