package Decorator;

public class Main {
    public static void main(String[] args) {
        // Basic burger
        Burger burger = new BasicBurger();
        System.out.println(burger.getDescription() + " Rs. " + burger.getCost());

        // Add additional toppings
        burger = new CheeseDecorator(burger);
        burger = new TomatoDecorator(burger);
        burger = new LettuceDecorator(burger);
        burger = new SpicySauceDecorator(burger);

        System.out.println(burger.getDescription() + " Rs. " + burger.getCost());
    }
    
}

/*
    Output : 
    Basic Burger Rs. 50.0
    Basic Burger, Cheese, Tomato, Lettuce, Spicy Sauce Rs. 75.0
*/
