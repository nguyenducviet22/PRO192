package data;

public class Students {
    private String name;
    private int yob;
    private double gpa;
    
    public Students (String iName, int iYob, double iGpa){
        name = iName;
        yob = iYob;
        gpa = iGpa;
    }
    
    public void studyPotions(){
        System.out.println(name + " Liquid luck " + gpa);
    }
    
    public void studyDADA(){
        System.out.println(name + " Expecto patronum " + gpa);
    }
    
    public void studyTransfiguration(){
        System.out.println(name + " Vera verto " + gpa);
    }
    
    public void setNewGpa(double newGpa){
        gpa = newGpa;
    }
    
    public int getYob(){
        return yob;
    }
}
