package abstractfactory;

public class DigitalReceipt implements Receipt {
    @Override
    public String describe() {
        return "Digital receipt (sent by email)";
    }
}
