package factorymethod;

public class Latte implements Drink {
    @Override
    public String prepare() {
        return "Latte: pull a double espresso shot, steam 200ml milk, pour with light foam.";
    }
}
