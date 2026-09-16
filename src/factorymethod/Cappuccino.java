package factorymethod;

public class Cappuccino implements Drink {
    @Override
    public String prepare() {
        return "Cappuccino: pull a single espresso shot, steam milk into thick foam, layer evenly.";
    }
}
