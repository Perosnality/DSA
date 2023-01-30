package Assigment;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Removing all non-alphanumeric characters and converting to lowercase
        input = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        // Initializing left and right pointers
        int left = 0;
        int right = input.length() - 1;
        
        // Iterating through the string while comparing characters at left and right pointers
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                System.out.println("The string is not a palindrome.");
                return;
            }
            left++;
            right--;
        }
        
        System.out.println("The string is a palindrome.");
    }
}

