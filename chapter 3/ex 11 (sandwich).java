\\\Sandwich and TestSandwich should be on the same folder to work\\\

/*
11. a. Create a class named Sandwich. Data fields include a String for the main
ingredient (such as “tuna”), a String for bread type (such as “wheat”), and a
double for price (such as 4.99). Include methods to get and set values for each of
these fields. Save the class as Sandwich.java.

b. Create an application named TestSandwich that instantiates one Sandwich object
and demonstrates the use of the set and get methods. Save this application as
TestSandwich.java.
*/

public class Sandwich {

    // Instance variables
    private String mainIngredient;
    private String typeOfBread;
    private double price;

    // Constructor
    public Sandwich(String mainIngredient, String typeOfBread, double price) {
        this.mainIngredient = mainIngredient;
        this.typeOfBread = typeOfBread;
        this.price = price;
    }

    // Getter and setter for main ingredient
    public String getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(String mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    // Getter and setter for type of bread
    public String getTypeOfBread() {
        return typeOfBread;
    }

    public void setTypeOfBread(String typeOfBread) {
        this.typeOfBread = typeOfBread;
    }

    // Getter and setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
