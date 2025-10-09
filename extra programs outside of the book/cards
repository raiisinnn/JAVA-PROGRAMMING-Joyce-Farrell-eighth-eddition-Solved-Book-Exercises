\\\cards and war2 should be on the same folder to work\\\

/*
Class: Card

This class represents a playing card with three main fields:
- value  → numeric value (1–13)
- suit   → "Spades", "Hearts", "Diamonds", or "Clubs"
- rank   → "Ace", "2"..."10", "Jack", "Queen", "King"

The class includes:
- Constructor: sets both the value and suit.
- setValue(): assigns numeric value and determines rank name.
- toString(): returns a readable card description (e.g., "Queen of Hearts").
*/

public class Card {
    private int value;
    private String suit;
    private String rank;

    // Constructor
    public Card(int value, String suit) {
        setValue(value);
        setSuit(suit);
    }

    // Sets numeric value and rank name
    public void setValue(int value) {
        this.value = value;
        switch (value) {
            case 1 -> this.rank = "Ace";
            case 11 -> this.rank = "Jack";
            case 12 -> this.rank = "Queen";
            case 13 -> this.rank = "King";
            default -> this.rank = Integer.toString(value); // For 2–10
        }
    }

    // Sets the suit of the card
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // Getters
    public int getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    // Returns a descriptive string like "Jack of Spades"
    public String toString() {
        return rank + " of " + suit;
    }
}
