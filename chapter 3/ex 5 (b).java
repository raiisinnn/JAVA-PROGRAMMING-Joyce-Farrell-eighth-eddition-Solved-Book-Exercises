import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask the user for two numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Call the method twice, swapping the order
        computePercent(num1, num2);
        computePercent(num2, num1);

        input.close(); // Always close the scanner
    }

    // Method that computes what percent num1 is of num2
    public static void computePercent(double num1, double num2) {
        double percent = (num1 / num2) * 100;
        System.out.printf("%.2f is %.2f%% of %.2f%n", num1, percent, num2);
    }
}
