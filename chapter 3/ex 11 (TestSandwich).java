\\\Sandwich and TestSandwich should be on the same folder to work\\\

public class TestSandwich {
    public static void main(String[] args) {

        // Create a Sandwich object
        Sandwich sandwich = new Sandwich("Tuna", "Wheat", 4.99);

        // Update sandwich details
        sandwich.setMainIngredient("Chicken");
        sandwich.setTypeOfBread("White");
        sandwich.setPrice(4.99);

        // Display sandwich details
        System.out.println("Main Ingredient: " + sandwich.getMainIngredient());
        System.out.println("Bread Type: " + sandwich.getTypeOfBread());
        System.out.println("Price: $" + sandwich.getPrice());
    }
}
