package com.gmail.alinakotova102.task21;

import java.util.Objects;
import java.util.Scanner;

import static com.gmail.alinakotova102.task21.Drinks.menu;
import static com.gmail.alinakotova102.task21.DrinksMachine.getCount;
import static com.gmail.alinakotova102.task21.DrinksMachine.getTotalPrice;

public class Order {

    public void create() {
        menu();
        System.out.println("Enter from the list: ");
        String drink = null;
        while (!Objects.equals(drink, "exit")) {
            drink = enter();
            if (!Objects.equals(drink, "exit")) {
                new DrinksMachine(Drinks.select(drink));
                System.out.println("(If you want to leave write \"exit\")");
            }
        }
    }

    public void check(){
        System.out.printf("Ready!\nYour order quantity %d and total amount - %.2f$",
                getCount(), getTotalPrice());
    }

    public static String enter() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}