package com.gmail.alinakotova102.task21;

enum Drinks {
    COFFEE("Coffee", 2.50),
    TEA("Tea", 1.50),
    LEMONADE("Lemonade", 3.0),
    MOJITO("Mojito", 6.0),
    MINERAL("Mineral", 1.0),
    COCA_COLA("Coca-cola", 2.50),
    UNKNOWN();

    private final String name;
    private final double price;

    Drinks() {
        this.name = "UNKNOWN";
        this.price = 0.0;
    }

    Drinks(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }

    public static void menu() {
        int i = 1;
        for (Drinks drinks : Drinks.values()) {
            if (drinks != UNKNOWN) {
                System.out.println(i + " - " + drinks.getName() + " - " + DrinksMachine.getPrice(drinks) + "$");
                DrinksMachine.composition(drinks);
                i++;
            }
        }
    }

    public static Drinks select(String name) {
        for (Drinks drinks : Drinks.values()) {
            if (drinks.name.toUpperCase().equals(name.toUpperCase())) {
                return drinks;
            }
        }
        return UNKNOWN;
    }
}