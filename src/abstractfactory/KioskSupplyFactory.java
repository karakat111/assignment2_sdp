package abstractfactory;

public interface KioskSupplyFactory {
    Cup createCup();
    Lid createLid();
    Receipt createReceipt();
}
