package Decorator;

// Concrete Decorator
public class LettuceDecorator extends BurgerDecorator {
    public LettuceDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Lettuce";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
