package HotDrink;

import java.util.StringJoiner;

public class HotDrinkCofee extends HotDrink{
    int temperature;

    public HotDrinkCofee(int name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        StringJoiner product = new StringJoiner( " ");
        switch (name) {
            case 1:
                product.add( "Cofee");
                break;
            case 2:
                product.add("Latte");
                break;
            case 3:
                product.add("Cappuccino");
                break;
            default:
                product.add("Error");


        }
        switch (volume) {
            case 1:
                product.add( "Light");
                break;
            case 2:
                product.add( "Midl");
                break;
            case 3:
                product.add( "Strong");
                break;
            default:
                product.add("Error");

        }
        switch (temperature) {
            case 1:
                product.add( "Warm" );
                break;
            case 2:
                product.add( "Hot" );
                break;
            case 3:
                product.add( "Boiling" );
                break;
            default:
                product.add( "Error");

        }
        return product.toString();
    }
}
