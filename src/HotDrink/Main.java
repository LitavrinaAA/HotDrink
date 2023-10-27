package HotDrink;

public class Main {
    public static void main(String[] args) {
//        HotDrinkCofee coffe = new HotDrinkCofee(1,1,1);
//        HotDrinkCofee latte = new HotDrinkCofee(1,2,1);
//        HotDrinkCofee capuchino = new HotDrinkCofee(1,3,1);

        HotDrincMachine vend1 = new HotDrincMachine();
        System.out.println("Ваш напиток: " + vend1.getProduct(3,2,1));


    }
}
