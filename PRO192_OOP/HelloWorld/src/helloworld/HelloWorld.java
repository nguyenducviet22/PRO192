package helloworld;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the first number: ");
        int b = sc.nextInt();
        
        TotalTwo tt = new TotalTwo(a, b);
        int sum = tt.calculateSum();
        System.out.println("The total: " + sum);
        
    }
}
