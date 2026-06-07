/*
5. Write an application that counts the words in a String entered by a user. Words are
separated by any combination of spaces, periods, commas, semicolons, question
marks, exclamation points, or dashes. Figure 7-17 shows two typical executions. Save
the file as CountWords.java.
*/

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for a sentence
        System.out.print("Enter a string: ");
        String inputString = input.nextLine();

        int wordCount = 0;
        boolean inWord = false;

        // Loop through each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            // Check if the character is part of a word
            if (Character.isLetterOrDigit(currentChar)) {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                inWord = false;
            }
        }

        // Display the total number of words
        System.out.println("The number of words in the string is: " + wordCount);

        input.close();
    }
}
