package Decorator;

// Concrete Decorator
public class TomatoDecorator extends BurgerDecorator {
    public TomatoDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Tomato";
    }

    @Override
    public double getCost() {
        return super.getCost() + 6.0;
    }
}
