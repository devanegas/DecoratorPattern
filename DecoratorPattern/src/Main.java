
public class Main {

    public static void main(String[] args) {
	Beverage beverage = new DarkRoast();
	Beverage beverage1 = new Espresso();

        beverage1 = new Cream(beverage1);
        beverage1 = new Sugar(beverage1);
        beverage1 = new Cinnamon(beverage1);

        System.out.printf(beverage1.getDescription() + ": $");
        System.out.printf("%.2f", beverage1.cost());

    }
}
