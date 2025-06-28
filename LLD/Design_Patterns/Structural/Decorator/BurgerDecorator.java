package Decorator;

// Abstract Decorator (Implements Burger and holds a reference to a Burger object)
public abstract class BurgerDecorator implements Burger {
    protected Burger burger;// Reference to the Burger object being decorated (wrapped)

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription();
    }

    @Override
    public double getCost() {
        return burger.getCost();
    }
}
