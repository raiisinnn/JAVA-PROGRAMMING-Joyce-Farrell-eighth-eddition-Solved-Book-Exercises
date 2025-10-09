/*
Exercise: Multiples of 50
a) Write a program that counts by fives from 5 to 200,
   printing each number on the same line, and moving to
   a new line after every multiple of 50 (that is, after
   50, 100, 150, and 200).
   Save the program as NumeroNgaPese.java

b) Modify the above program so that the user can input
   the counting step from the keyboard.
   Move to a new line after every 10 printed values.
   Save the modified program as NumeroNgaCfaredo.java
*/

import java.util.Scanner;

public class NumeroNgaCfaredo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask the user for the counting step
        System.out.print("Enter the step value for counting: ");
        int step = input.nextInt();

        int count = 0;

        // Count from 0 to 200 using the user-defined step
        for (int i = 0; i <= 200; i += step) {
            System.out.print(i + "   ");
            count++;

            // Move to a new line after every 10 printed values
            if (count % 10 == 0) {
                System.out.println();
            }
        }

        input.close();
    }
}
