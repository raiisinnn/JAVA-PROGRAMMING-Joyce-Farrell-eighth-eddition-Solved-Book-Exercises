import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
    public static void main(String[] args) {

        final double KM_PER_NM = 1.852;       // 1 nautical mile = 1.852 kilometers
        final double MILES_PER_NM = 1.150779; // 1 nautical mile = 1.150779 miles

        // Ask the user for input
        String input = JOptionPane.showInputDialog(null, "Enter the desired number of nautical miles:");

        // Convert the input string to a double
        double nauticalMiles = Double.parseDouble(input);

        // Perform conversions
        double km = nauticalMiles * KM_PER_NM;
        double miles = nauticalMiles * MILES_PER_NM;

        // Display the results
        JOptionPane.showMessageDialog(
            null,
            nauticalMiles + " nautical miles is equal to:\n" +
            km + " kilometers\n" +
            miles + " miles"
        );
    }
}
