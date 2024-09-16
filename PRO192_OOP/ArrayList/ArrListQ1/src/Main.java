
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Square> squaresList = new ArrayList<>();

        int choice;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Enter a side");
            System.out.println("2. Search a square by the side");
            System.out.println("3. Print all squares");
            System.out.println("4. Remove a square by the side ");
            System.out.println("5. Update the side of a square");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addSquare(squaresList, sc);
                    break;
                case 2:
                    searchSquare(squaresList, sc);
                    break;
                case 3:
                    printSquaresList(squaresList);
                    break;
                case 4:
                    removeSquare(squaresList, sc);
                    break;
                case 5:
                    updateSquare(squaresList, sc);
                    break;
                case 0:
                    System.out.println("Exited!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static void addSquare(ArrayList<Square> squaresList, Scanner sc) {
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        Square sq = new Square(side);
        squaresList.add(sq);
    }
    
    public static void searchSquare(ArrayList<Square> squaresList, Scanner sc) {
        System.out.print("Enter your desired square's side: ");
        double side = sc.nextDouble();
        
        boolean found = false;
        for (Square square : squaresList) {
            if (square.length == side){
                square.printInfo();
                found = true;
                break;
            }
        }
        
        if (!found){
            System.out.println("Not found");
        }
    }

    public static void printSquaresList(ArrayList<Square> squaresList) {
        System.out.println("List of Squares: ");
        for (Square square : squaresList) {
            square.printInfo();
        }
    }
    
    public static void removeSquare(ArrayList<Square> squaresList, Scanner sc){
        System.out.print("Enter removed square's side: ");
        double side = sc.nextDouble();
        
        boolean found = false;
        for (int i = 0; i < squaresList.size(); i++) {
            if (squaresList.get(i).length == side){
                squaresList.remove(i);
                found = true;
                break;
            }
        }
        
        if (!found){
            System.out.println("Not existed");
        } else {
            System.out.println("successfully removed");
        }
    }
    
    public static void updateSquare(ArrayList<Square> squaresList, Scanner sc) {
        System.out.println("Enter updated square's side: ");
        double side = sc.nextDouble();
        
        boolean found = false;
        for (int i = 0; i < squaresList.size(); i++) {
            if (squaresList.get(i).length == side){
                System.out.println("Enter new value's side for square: ");
                double newSide = sc.nextDouble();
                Square newSquare = new Square(newSide);
                squaresList.set(i, newSquare);
                found = true;
                break;
            }
        }
        
        if (!found) System.out.println("Not found");
        else System.out.println("successfully updated");
    }
}
