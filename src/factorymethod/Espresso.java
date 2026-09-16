package factorymethod;

public class Espresso implements Drink {
    @Override
    public String prepare() {
        return "Espresso: extract 30ml under 9 bars pressure, serve in a demitasse cup.";
    }
}
