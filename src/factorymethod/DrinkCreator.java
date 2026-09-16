package factorymethod;

public abstract class DrinkCreator {

    protected abstract Drink createDrink();

    public String serveDrink() {
        Drink drink = createDrink();
        return drink.prepare();
    }
}
