/*
9. The Harrison Group Life Insurance company computes annual policy premiums
based on the age the customer turns in the current calendar year. The premium is
computed by taking the decade of the customer’s age, adding 15 to it, and multiplying
by 20. For example, a 34 year old would pay $360, which is calculated by adding the
decades (3) to 15, and then multiplying by 20. Write an application that prompts a
user for the current year and a birth year. Pass both to a method that calculates and
returns the premium amount, and then display the returned amount. Save the
application as Insurance.java.
*/

import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Calculate premium using the method
        int premium = computePremium(currentYear, birthYear);

        // Display result
        System.out.println("Your insurance premium is: $" + premium);

        input.close(); // Close the scanner
    }

    // Method that calculates the insurance premium
    public static int computePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;     // Calculate current age
        int decade = age / 10;                 // Determine how many decades old
        int premium = (decade + 15) * 20;      // Formula for premium
        return premium;
    }
}
