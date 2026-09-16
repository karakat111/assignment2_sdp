import factorymethod.DrinkCreator;
import factorymethod.EspressoCreator;
import factorymethod.LatteCreator;
import factorymethod.CappuccinoCreator;
import abstractfactory.CoffeeKiosk;
import abstractfactory.KioskSupplyFactory;
import abstractfactory.ClassicSupplyFactory;
import abstractfactory.EcoSupplyFactory;

public class Main {
    public static void main(String[] args) {
        // Part A - Factory Method
        DrinkCreator espressoCreator = new EspressoCreator();
        DrinkCreator latteCreator = new LatteCreator();
        DrinkCreator cappuccinoCreator = new CappuccinoCreator();

        System.out.println(espressoCreator.serveDrink());
        System.out.println(latteCreator.serveDrink());
        System.out.println(cappuccinoCreator.serveDrink());

        System.out.println();

        // Part B - Abstract Factory
        // The family is selected here, in exactly one place.
        KioskSupplyFactory supplyFactory = new ClassicSupplyFactory();
        CoffeeKiosk classicKiosk = new CoffeeKiosk(supplyFactory);
        System.out.println("Classic order: " + classicKiosk.packageOrder());

        KioskSupplyFactory ecoFactory = new EcoSupplyFactory();
        CoffeeKiosk ecoKiosk = new CoffeeKiosk(ecoFactory);
        System.out.println("Eco order: " + ecoKiosk.packageOrder());
    }
}
