/*
Exercise Display Stars
Create a program that reads five integers between 1 and 30.
After reading all five numbers, the program should display a line
of asterisks (*) for each number, where the number of stars equals
the value of the number entered.

Use a separate method with one parameter to print the stars.

Example output:
Input: 5 3 10 2 7
Output:
* * * * *
* * *
* * * * * * * * * *
* *
* * * * * * *

Save the program as Stars.java
*/

import java.util.Scanner;

public class Stars {

    // Method that prints stars based on the given number
    public static void printStars(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(" * ");
        }
        System.out.println(); // Move to the next line after each set of stars
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Loop to read five numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number between 1 and 30: ");
            int number = input.nextInt();

            // Validate the number range
            if (number >= 1 && number <= 30) {
                printStars(number);
            } else {
                System.out.println("The number must be between 1 and 30.");
                i--; // Repeats the iteration for invalid input
            }
        }

        input.close();
    }
}
