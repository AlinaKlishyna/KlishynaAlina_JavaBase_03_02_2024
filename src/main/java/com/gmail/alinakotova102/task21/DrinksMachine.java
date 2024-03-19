package com.gmail.alinakotova102.task21;

import static com.gmail.alinakotova102.task21.Drinks.UNKNOWN;

public class DrinksMachine {
    private static int count;
    private static double totalPrice;

    public DrinksMachine(Drinks name) {
        if (name != UNKNOWN) {
            totalPrice += getPrice(name);
            count++;
            System.out.println("Drink: " + name + " - " + getPrice(name) + "(" + count + ")" + "\nTotal sum: " + totalPrice);

        } else {
            System.out.println("it's drink not found!");
        }
    }

    public static int getCount() {
        return count;
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static double getPrice(Drinks name) {
        switch (name) {
            case COFFEE:
                return Drinks.COFFEE.getPrice();
            case TEA:
                return Drinks.TEA.getPrice();
            case LEMONADE:
                return Drinks.LEMONADE.getPrice();
            case MOJITO:
                return Drinks.MOJITO.getPrice();
            case MINERAL:
                return Drinks.MINERAL.getPrice();
            case COCA_COLA:
                return Drinks.COCA_COLA.getPrice();
        }
        return UNKNOWN.getPrice();
    }

    public static void composition(Drinks name) {
        System.out.print("Composition: ");
        switch (name) {
            case COFFEE:
                System.out.print("Brazilian coffee, milk");
                break;
            case TEA:
                System.out.print("Indian tea");
                break;
            case MOJITO:
                System.out.print("Mint, white rum, soda, ice");
                break;
            case MINERAL:
                System.out.print("Mineral");
                break;
            case LEMONADE:
                System.out.print("Lemon, soda, sugar");
                break;
            case COCA_COLA:
                System.out.print("Coca-cola");
                break;
            case UNKNOWN:
                break;
        }
        System.out.println("\n");
    }
}