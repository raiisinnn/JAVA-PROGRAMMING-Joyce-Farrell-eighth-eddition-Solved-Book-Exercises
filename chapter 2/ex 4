/*
4. a. Write a Java class that declares a named constant to hold the number of quarts
in a gallon (4). Also declare a variable to represent the number of quarts
needed for a painting job, and assign an appropriate value—for example, 18.
Compute and display the number of gallons and quarts needed for the job.
Display explanatory text with the values—for example, A job that needs 18
quarts requires 4 gallons plus 2 quarts. Save the class as QuartsToGallons.
java.
b. Convert the QuartsToGallons class to an interactive application. Instead of
assigning a value to the number of quarts, accept the value from the user as input.
Save the revised class as QuartsToGallonsInteractive.java.
*/

public class QuartsToGallons {
    public static void main(String[] args) {

        final int QUARTS_PER_GALLON = 4;  // 1 gallon = 4 quarts
        int totalQuarts = 88;              // Example amount of quarts needed
        int gallons = totalQuarts / QUARTS_PER_GALLON;
        int remainingQuarts = totalQuarts % QUARTS_PER_GALLON;

        System.out.println(
            "A job that needs " + totalQuarts + " quarts requires " +
            gallons + " gallons plus " + remainingQuarts + " quarts."
        );
    }
}
