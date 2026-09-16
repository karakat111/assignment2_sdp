package abstractfactory;

public class EcoSupplyFactory implements KioskSupplyFactory {
    @Override
    public Cup createCup() { return new ReusableCup(); }

    @Override
    public Lid createLid() { return new BiodegradableLid(); }

    @Override
    public Receipt createReceipt() { return new DigitalReceipt(); }
}
