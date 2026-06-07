/*
Write a Java class that declares named constants to represent the number of
kilometers (1.852) and the number of miles (1.150779) in a nautical mile. Also
declare a variable to represent a number of nautical miles and assign a value to it.
Compute and display, with explanatory text, the value in kilometers and in miles.
Save the class as NauticalMiles.java.
b. Convert the NauticalMiles class to an interactive application. Instead of
assigning a value to the nautical miles variable, accept it from the user as input.
Save the revised class as NauticalMilesInteractive.java.
*/

import javax.swing.JOptionPane;

public class NauticalMiles {
    public static void main(String[] args) {
        final double KM_PER_NM = 1.852;       // 1 nautical mile = 1.852 kilometers
        final double MILES_PER_NM = 1.150779; // 1 nautical mile = 1.150779 miles

        double nauticalMiles = 33; // Example value
        double km = nauticalMiles * KM_PER_NM;
        double miles = nauticalMiles * MILES_PER_NM;

        JOptionPane.showMessageDialog(
            null,
            nauticalMiles + " nautical miles is equal to:\n" +
            km + " kilometers\n" +
            miles + " miles"
        );
    }
}
