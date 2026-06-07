/*
Exercise 3: Odd Number
Write a program that reads an odd number from the keyboard to continue
or 999 to stop.

- When the user enters an odd number, display: "Odd number!".
- If the user enters an even number, display an error message and ask
  for another number.
- If the user enters 999, the program ends.

Save the program as NumratTekCikel.java
*/

import java.util.Scanner;

public class NumratTekCikel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = 0;

        while (num != 999) {
            System.out.print("Enter an odd number or type 999 to stop the program: ");
            num = input.nextInt();

            if (num == 999) {
                System.out.println("Program END...");
                break;
            }

            if (num % 2 != 0) {
                System.out.println("Odd number!");
            } else {
                System.out.println("ERROR! Please enter an odd number.");
            }
        }

        input.close();
    }
}
