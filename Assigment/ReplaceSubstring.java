package Assigment;

import java.util.Scanner;

public class ReplaceSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get the input string
        System.out.print("Enter the input string: ");
        String input = sc.nextLine();
        
        // Get the substring to be replaced
        System.out.print("Enter the substring to be replaced: ");
        String substring = sc.nextLine();
        
        // Get the replacement string
        System.out.print("Enter the replacement string: ");
        String replacement = sc.nextLine();
        
        // Replace all occurrences of the substring in the input string
        String modified = input.replaceAll(substring, replacement);
        
        // Print the modified string
        System.out.println("Modified string: " + modified);
    }
}
