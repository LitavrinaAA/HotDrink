package HotDrink;

public class HotDrincMachine extends VendingMashine {
    @Override
    public HotDrink getProduct(int name, int volume, int temperature) {

        return new HotDrinkCofee(name,volume, temperature);
    }
}
