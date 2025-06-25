package LLD.Design_Patterns.Creational.Builder;

import java.util.*;

public class BurgerMeal {
    // Required fields
    private final String bunType;
    private final String patty;

    // Optional fields
    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    // Private constructor, only accessible via Builder
    private BurgerMeal(BurgerBuilder builder){
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;
    }

    // For printing the burger meal configuration
    public void printSummary() {
        System.out.println("Burger Meal Summary:");
        System.out.println("Bun: " + bunType);
        System.out.println("Patty: " + patty);
        System.out.println("Cheese: " + (hasCheese ? "Yes" : "No"));
        System.out.println("Toppings: " + (toppings != null ? toppings : "None"));
        System.out.println("Side: " + (side != null ? side : "None"));
        System.out.println("Drink: " + (drink != null ? drink : "None"));
        System.out.println();
    }

    //Builder class
    public static class BurgerBuilder{
        // Required fields
        private final String bunType;
        private final String patty;

        // Optional fields
        private boolean hasCheese;
        private List<String> toppings;
        private String side;
        private String drink;

        // Builder constructor with required parameters
        public BurgerBuilder(String bunType, String patty){
            this.bunType = bunType;
            this.patty = patty;
        }

        // Optional field setters (return builder for chaining)
        public BurgerBuilder withCheese(boolean hasCheese){
            this.hasCheese = hasCheese;
            return this;
        }

        public BurgerBuilder withToppings(List<String> toppings){
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder withSide(String side){
            this.side = side;
            return this;
        }

        public BurgerBuilder withDrink(String drink){
            this.drink = drink;
            return this;
        }

        // Final build method that returns the constructed object
        public BurgerMeal build(){
            return new BurgerMeal(this);
        }

    }
    
}
