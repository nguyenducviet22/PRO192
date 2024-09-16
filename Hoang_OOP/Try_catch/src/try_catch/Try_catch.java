package try_catch;

import java.util.Scanner;

public class Try_catch {

    public static void main(String[] args) {
        inputProfile();

    }

    public static void inputProfile() {
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {
            try {
                System.out.print("Enter your yob: ");
                yob = Integer.parseInt(sc.nextLine());

//                yob = sc.nextInt();
//                sc.nextLine();// delete left enter press 
                break;
            } catch (Exception e) {
                System.out.println("Please enter again");
            }
        }

        System.out.print("Enter your address: ");
        address = sc.nextLine();

        System.out.println("Here your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);

    }

}
