package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> dishes = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getDishes() {
        return dishes;
    }

    @Override
    public String toString() {

        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder entrees = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("entree")) {
                entrees.append("\n").append(item.toString()).append("\n");
            }
        }

        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : dishes) {
            if (item.getCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }
        return "\nSTUDIO FOOD PLACE\n" +
                "\n*** Appetizers ***\n" + appetizers.toString() + "\n" +
                "\n*** Entrees ***\n" + entrees.toString() + "\n" +
                "\n*** Desserts ***\n" + desserts.toString() + "\n" +
                "\nMenu Last Updated: " + lastUpdated;
    }

    void addDish(MenuItem newItem) {

        if (dishes.contains(newItem)) {
            System.out.println("That item is already on the menu!");
            return;
        }
        for (MenuItem item : dishes) {
            if (item.equals(newItem)) {
                System.out.println("That item is already on the menu!");
                return;
            }
        }

        dishes.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeDish(MenuItem removeItem) {
        dishes.remove(removeItem);
        lastUpdated = LocalDate.now();
    }

}
