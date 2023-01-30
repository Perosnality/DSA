package Assigment;

import java.util.Scanner;



public class VowCons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Vowels: ");
        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a vowel
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                System.out.print(c + " ");
            }
        }

        System.out.print("\nConsonants: ");
        // Iterate through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a consonant
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
                // check if the character is a letter
                if(Character.isLetter(c))
                System.out.print(c + " ");
            }
        }
    }
}
