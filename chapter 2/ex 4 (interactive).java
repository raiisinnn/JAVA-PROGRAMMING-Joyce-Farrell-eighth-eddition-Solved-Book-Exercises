import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {

        final int QUARTS_PER_GALLON = 4;  // 1 gallon = 4 quarts
        Scanner input = new Scanner(System.in);

        // Ask the user for the total number of quarts
        System.out.print("Enter the number of quarts needed for the painting job: ");
        int totalQuarts = input.nextInt();

        // Perform the conversion
        int gallons = totalQuarts / QUARTS_PER_GALLON;
        int remainingQuarts = totalQuarts % QUARTS_PER_GALLON;

        // Display the result
        System.out.println(
            "A job that needs " + totalQuarts + " quarts requires " +
            gallons + " gallons plus " + remainingQuarts + " quarts."
        );

        input.close(); // Always close the Scanner when done
    }
}
