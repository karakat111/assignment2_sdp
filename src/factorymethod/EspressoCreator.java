package factorymethod;

public class EspressoCreator extends DrinkCreator {
    @Override
    protected Drink createDrink() {
        return new Espresso();
    }
}
