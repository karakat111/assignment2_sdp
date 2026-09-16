package factorymethod;

public class CappuccinoCreator extends DrinkCreator {
    @Override
    protected Drink createDrink() {
        return new Cappuccino();
    }
}
