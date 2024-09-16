/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] elements = new int[size]; // Create array with specified size

        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }

        System.out.println("Input successful!");

        System.out.print("Elements: ");
        for (int element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public static void insertElement(int[] elements, int filledElements, int element, int position) {
        if (filledElements == elements.length) {
            System.out.println("Array is full!");
            return;
        }

        if (position < 0 || position > filledElements - 1) {
            System.out.println("Invalid position!");
            return;
        }

        // Shift elements to the right
        for (int i = filledElements; i > position; i--) {
            elements[i] = elements[i - 1];
        }

        elements[position] = element;
        filledElements++;
        System.out.println("Element inserted successfully!");
    }

    public static void deleteElement(int[] elements, int filledElements, int element) {
        if (filledElements == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int index = -1;
        for (int i = 0; i < filledElements; i++) {
            if (elements[i] == element) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Element not found!");
            return;
        }

        // Shift elements to the left
        for (int i = index + 1; i < filledElements; i++) {
            elements[i - 1] = elements[i];
        }

        filledElements--;
        System.out.println("Element deleted successfully!");
    }

}
