package abstractfactory;

public class ClassicSupplyFactory implements KioskSupplyFactory {
    @Override
    public Cup createCup() { return new PaperCup(); }

    @Override
    public Lid createLid() { return new PlasticLid(); }

    @Override
    public Receipt createReceipt() { return new PrintedReceipt(); }
}
