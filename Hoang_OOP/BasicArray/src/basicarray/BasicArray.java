package basicarray;

public class BasicArray {

    public static void main(String[] args) {
//        createPrimitiveArray2();
//        createStudentObj();
//        createStudentArray();
        sortObjArray();

    }

    public static void sortObjArray() {
        Student list[] = new Student[2];
        list[0] = new Student("SE190002", "Hermione Granger", 2003, 9.8);
        list[1] = new Student("SE190003", "Ron Weasley", 2004, 9.7);

        if (list[0].getGpa() > list[1].getGpa()) {
            Student tmp = list[0];
            list[0] = list[1];
            list[1] = tmp;
        }

        for (Student st : list) {
            st.showProfile();
        }
    }

    public static void createStudentArray() {
        Student st[] = new Student[3];
        st[0] = new Student("SE190002", "Hermione Granger", 2003, 9.8);
        st[0].showProfile();
        st[1] = new Student("SE190003", "Ron Weasley", 2004, 9.7);
        st[2] = new Student("SE190001", "Harry Potter", 2004, 9.9);

        for (int i = 0; i < st.length; i++) {
            st[i].showProfile();
        }
    }

    public static void createStudentObj() {
        Student st = new Student("SE190001", "Harry Potter", 2004, 9.9);
        st.showProfile();
    }

    public static void createPrimitiveArray2() {
        double arr[] = new double[10];
        arr[0] = 1;
        arr[1] = 2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("\n");
        for (double d : arr) {
            System.out.print(d + " ");
        }

    }

    public static void createPrimitiveArray1() {
        double vol[] = {0.5, 2, 3.6, 4.3, 5.6};
        for (int i = 0; i < 5; i++) {
            System.out.print(vol[i] + " ");
        }
        System.out.println("\n");
        for (double x : vol) {
            System.out.print(x + " ");
        }
    }

}
