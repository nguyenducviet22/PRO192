package data;

public class Students {
    private String name;
    private int yob;
    private double gpa;

    public Students(String name, int yob, double gpa) {
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
//        return "Students{" + "name=" + name + ", yob=" + yob + ", gpa=" + gpa + '}';
//        String str = String.format("|%-20s|%4d|%4.1f|", name, yob, gpa);
//        return str;
        return String.format("|%-20s|%4d|%4.1f|", name, yob, gpa);
    }
    
    
}
