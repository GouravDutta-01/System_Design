package Decorator;

// Concrete Decorator
public class SpicySauceDecorator extends BurgerDecorator {
    public SpicySauceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Spicy Sauce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.0;
    }
}
