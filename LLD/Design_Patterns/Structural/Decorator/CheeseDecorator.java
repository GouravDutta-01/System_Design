package Decorator;

// Concrete Decorator
public class CheeseDecorator extends BurgerDecorator {
    public CheeseDecorator(Burger burger) {
        super(burger);// This calls the abstract class constructor
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cheese";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
