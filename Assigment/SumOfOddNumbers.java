package Assigment;

import java.util.Scanner;

public class SumOfOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            numbers[i] = scanner.nextInt();
        }
        int sum = 0; // Variable to store the sum

        // Iterate through the array
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            // Check if the current number is odd
            if (currentNumber % 2 != 0) {
                sum += currentNumber; // Add the current number to the sum
            }
        }

        System.out.println("Sum of odd numbers: " + sum);
    }
}
