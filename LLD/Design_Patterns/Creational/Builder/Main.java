package LLD.Design_Patterns.Creational.Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple burger with only required fields
        BurgerMeal simpleBurger = new BurgerMeal.BurgerBuilder("wheat", "veg").build();
        simpleBurger.printSummary();

        // Example 2: Burger with cheese and a side
        BurgerMeal fullBurger = new BurgerMeal.BurgerBuilder("wheat", "veg")
                                    .withCheese(true)
                                    .withSide("Fries")
                                    .withDrink("Cola")
                                    .withToppings(Arrays.asList("lettuce", "tomato", "onion"))
                                    .build();
        fullBurger.printSummary();
    }

}

/*
    Output : 
    Burger Meal Summary:
    Bun: wheat
    Patty: veg
    Cheese: No
    Toppings: None
    Side: None
    Drink: None

    Burger Meal Summary:
    Bun: wheat
    Patty: veg
    Cheese: Yes
    Toppings: [lettuce, tomato, onion]
    Side: Fries
    Drink: Cola

*/
