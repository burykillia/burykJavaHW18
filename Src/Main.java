import EnamHelper.DrinksMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Виберіть напій:");

            System.out.println("1. Кава");

            System.out.println("2. Чай");

            System.out.println("3. Леионад");

            System.out.println("4. Мохіто");

            System.out.println("5. Мінеральна вода");

            System.out.println("6. Кока кола");

            System.out.println("7. Закнічити2");

            int choice = scanner.nextInt();

            DrinksMachine drink;

            switch (choice) {

                case 1:

                    drink = DrinksMachine.COFFEE;

                    break;

                case 2:

                    drink = DrinksMachine.TEA;

                    break;

                case 3:

                    drink = DrinksMachine.LEMONADE;

                    break;

                case 4:

                    drink = DrinksMachine.MOJITO;

                    break;

                case 5:

                    drink = DrinksMachine.MINERAL_WATER;

                    break;

                case 6:

                    drink = DrinksMachine.COCA_COLA;

                    break;

                case 7:

                    Drinks.displayTotal();

                    return;

                default:

                    System.out.println("Invalid choice.");

                    continue;

            }

            Drinks.makeDrink(drink);

            Drinks.calculateTotalAmount(drink);

        }

    }

}

