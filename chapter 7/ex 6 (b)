import java.util.Scanner;

public class Alphabetize2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user to enter three strings
        System.out.print("Enter the first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = input.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = input.nextLine();

        String temp;

        // Compare and swap to alphabetize
        if (str1.compareToIgnoreCase(str2) > 0) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str2.compareToIgnoreCase(str3) > 0) {
            temp = str2;
            str2 = str3;
            str3 = temp;
        }

        if (str1.compareToIgnoreCase(str2) > 0) {
            temp = str1;
            str1 = str2;
            str2 = temp;
        }

        // Display results
        System.out.println("\nThe strings in alphabetical order are:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        input.close();
    }
}
