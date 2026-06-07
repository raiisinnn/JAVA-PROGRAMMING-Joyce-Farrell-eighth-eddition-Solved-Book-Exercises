\\\cards and war 2 should be on the same folder to work\\\

/*
Program: War2 (Card Game)

This program simulates a simple "War" card game between a player
and the computer.

Rules:
- Each draws one random card (value 1–13 and a random suit).
- Ace (1) is treated as the lowest card.
- The higher card wins; equal values result in a tie.

Output Example:
My card: 8 of Hearts
Computer card: King of Spades
Computer wins!

Save the program as War2.java
*/

import java.util.Random;

public class War2 {
    public static void main(String[] args) {
        Random random = new Random();

        // Available suits
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

        // Generate random card for player
        Card playerCard = new Card(random.nextInt(13) + 1, suits[random.nextInt(suits.length)]);

        // Generate random card for computer
        Card computerCard = new Card(random.nextInt(13) + 1, suits[random.nextInt(suits.length)]);

        // Display both cards
        System.out.println("Your card: " + playerCard);
        System.out.println("Computer's card: " + computerCard);

        // Determine and display the winner
        if (playerCard.getValue() > computerCard.getValue()) {
            System.out.println("You win!");
        } else if (playerCard.getValue() < computerCard.getValue()) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
