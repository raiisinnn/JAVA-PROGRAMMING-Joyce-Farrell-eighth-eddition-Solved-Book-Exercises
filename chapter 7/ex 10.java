/*
10. Write an application that determines whether a phrase entered by the user is a palindrome.
A palindrome is a phrase that reads the same backward and forward without regarding capitalization or punctuation.
For example, “Dot saw I was Tod”, “Was it a car or a cat I saw?”, and “Madam, I’m Adam” are palindromes. Save the file asPalindrome.java.
*/

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for a phrase
        System.out.print("Enter a phrase to check if it is a palindrome: ");
        String phrase = input.nextLine();

        // Remove all non-alphanumeric characters and convert to lowercase
        String cleanPhrase = phrase.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned phrase
        String reversedPhrase = "";
        for (int i = cleanPhrase.length() - 1; i >= 0; i--) {
            reversedPhrase += cleanPhrase.charAt(i);
        }

        // Check if it is a palindrome
        if (cleanPhrase.equals(reversedPhrase)) {
            System.out.println("\"" + phrase + "\" is a palindrome phrase.");
        } else {
            System.out.println("\"" + phrase + "\" is not a palindrome phrase.");
        }

        input.close();
    }
}
