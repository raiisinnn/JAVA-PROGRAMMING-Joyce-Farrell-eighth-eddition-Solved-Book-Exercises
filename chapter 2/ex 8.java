/*
8. Meadowdale Dairy Farm sells organic brown eggs to local customers. They charge
$3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen.
Write a class that prompts a user for the number of eggs in the order and then display
the amount owed with a full explanation. For example, typical output might be, “You
ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each
for a total of $7.85.” Save the class as Eggs.java.
*/

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {

        final double PRICE_PER_DOZEN = 3.25;   // Price for one dozen eggs
        final double PRICE_PER_EGG = 0.45;     // Price for one single egg

        Scanner input = new Scanner(System.in);

        // Ask the user for the number of eggs
        System.out.print("Enter the number of eggs you wish to order: ");
        int eggs = input.nextInt();

        // Calculate dozens and remaining single eggs
        int dozens = eggs / 12;                // 12 eggs in a dozen
        int singleEggs = eggs % 12;

        // Calculate total cost
        double costForDozens = dozens * PRICE_PER_DOZEN;
        double costForSingleEggs = singleEggs * PRICE_PER_EGG;
        double totalCost = costForDozens + costForSingleEggs;

        // Display the results
        System.out.println(
            "You ordered " + eggs + " eggs. That's " +
            dozens + " dozen at $" + PRICE_PER_DOZEN + " per dozen and " +
            singleEggs + " loose eggs at $" + PRICE_PER_EGG + " each.\n" +
            "The total cost is: $" + String.format("%.2f", totalCost)
        );

        input.close();
    }
}
