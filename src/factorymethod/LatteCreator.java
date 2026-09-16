package factorymethod;

public class LatteCreator extends DrinkCreator {
    @Override
    protected Drink createDrink() {
        return new Latte();
    }
}
