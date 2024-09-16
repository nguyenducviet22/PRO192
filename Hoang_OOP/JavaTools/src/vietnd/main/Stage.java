package vietnd.main;

import vietnd.util.JavaTools;

public class Stage {

    public static void main(String[] args) {
//        System.out.println("PI: " + JavaTools.PI);
//
//        int n = JavaTools.getAnInteger("Enter your number: ");
//        System.out.println("number: " + n);

        String name = null;
        if (name == null) {
            throw new NullPointerException("name must not be null.");
        }
        System.out.println("length of name: " + name.length());
    }
}
