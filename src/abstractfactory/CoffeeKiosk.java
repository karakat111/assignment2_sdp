package abstractfactory;

public class CoffeeKiosk {

    private final KioskSupplyFactory supplyFactory;

    public CoffeeKiosk(KioskSupplyFactory supplyFactory) {
        this.supplyFactory = supplyFactory;
    }

    public String packageOrder() {
        Cup cup = supplyFactory.createCup();
        Lid lid = supplyFactory.createLid();
        Receipt receipt = supplyFactory.createReceipt();
        return cup.describe() + " + " + lid.describe() + " + " + receipt.describe();
    }
}
