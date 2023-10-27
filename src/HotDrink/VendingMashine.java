package HotDrink;

public class VendingMashine {
    int name;
    int volume;
    int temperature;

    public HotDrink getProduct(int name, int volume, int temperature) {
           return new HotDrinkCofee(name,volume, temperature);
    }


}
