package abstractfactory;

public class PrintedReceipt implements Receipt {
    @Override
    public String describe() {
        return "Printed paper receipt";
    }
}
