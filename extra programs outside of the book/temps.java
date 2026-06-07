/*
Write a program that reads from the keyboard the highest and lowest
temperature of the day.

- If the highest temperature is greater than or equal to 40°C,
  display: "Hot day".
- If the lowest temperature is below 0°C,
  display: "Cold day".
- If the difference between the two temperatures is greater than 10°C,
  display: "Large temperature difference".

Save the program as Temperaturat.java
*/

import java.util.Scanner;

public class Temperaturat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for temperatures
        System.out.print("Enter today's highest recorded temperature: ");
        double highestTemp = input.nextDouble();

        System.out.print("Enter today's lowest recorded temperature: ");
        double lowestTemp = input.nextDouble();

        // Check conditions and display results
        if (highestTemp >= 40) {
            System.out.println("Hot day");
        }

        if (lowestTemp < 0) {
            System.out.println("Cold day");
        }

        double difference = highestTemp - lowestTemp;

        if (difference > 10) {
            System.out.println("Large temperature difference");
        }

        input.close();
    }
}
