package Assigment;

import java.util.Scanner;
import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by commas: ");
        String input = scanner.nextLine();
        // Split the input string into an array of strings using the comma as a separator
        String[] inputNumbers = input.split(",");
        // Create an array of integers with the same size as the input array
        int[] numbers = new int[inputNumbers.length];
        // Iterate through the input array and parse each string to an integer
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }
        // Find the max and min
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

