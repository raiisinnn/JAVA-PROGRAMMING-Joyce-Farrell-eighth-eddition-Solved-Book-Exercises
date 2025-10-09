/*
6. a. Write an application that accepts three Strings from the user and displays one of
two messages depending on whether the user entered the Strings in alphabetical
order without regard to case. Save the file as Alphabetize.java.

b. Write an application that accepts three Strings from the user and displays them
in alphabetical order without regard to case. Save the file as Alphabetize2.java.
*/

import java.util.Scanner;

public class Alphabetize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter three strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = input.nextLine();

        // Check if they are in alphabetical order (case-insensitive)
        if (str1.compareToIgnoreCase(str2) <= 0 && str2.compareToIgnoreCase(str3) <= 0) {
            System.out.println("The strings are in alphabetical order.");
        } else {
            System.out.println("The strings are not in alphabetical order.");
        }

        input.close();
    }
}
