import EnamHelper.DrinksMachine;

public class Drinks {
    private static final int costCoffee = 20;
    private static final int costTea = 18;
    private static final int costLemonade = 22;
    private static final int costMojito = 24;
    private static final int costMineralWater = 16;
    private static final int costCocaCola = 23;
    private static int totalAmount = 0;

    private static int totalDrinks = 0;

    public static void makeDrink(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:

                System.out.println("Готуєтья кава зачекайте");

                break;

            case TEA:

                System.out.println("Готуєтья чай зачекайте");

                break;

            case LEMONADE:

                System.out.println("Готуєтья лемонад зачекайте");

                break;

            case MOJITO:

                System.out.println("Готуєтья мохіто зачекайте");

                break;

            case MINERAL_WATER:

                System.out.println("Готуєтья мінеральна вода зачекайте");

                break;

            case COCA_COLA:

                System.out.println("Готуєтья кока кола зачекайте");

                break;

            default:

                System.out.println("Не вірна опція спробуйте ще раз");

        }

        totalDrinks++;

    }

    public static void calculateTotalAmount(DrinksMachine drink) {

        switch (drink) {

            case COFFEE:

                totalAmount += costCoffee;

                break;

            case TEA:

                totalAmount += costTea;

                break;

            case LEMONADE:

                totalAmount += costLemonade;

                break;

            case MOJITO:

                totalAmount += costMojito;

                break;

            case MINERAL_WATER:

                totalAmount += costMineralWater;

                break;

            case COCA_COLA:

                totalAmount += costCocaCola;

                break;

        }


    }

    public static void displayTotal() {

        System.out.println("Кількість напоїв: " + totalDrinks + " шт.");

        System.out.println("Загальна вартість: " + totalAmount + " грн");

    }
}


