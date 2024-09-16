package org.launchcode;

public class Restaurant {
    public static void main(String[] args) {
        MenuItem itemOne = new MenuItem("Spaghetti", 8.99, "Perfect Al dente Spaghetti Pasta with Tomato Sauce", "entree", "1700-12-25");
        MenuItem itemTwo = new MenuItem("Cheese Fries", 7.99, "Crispy Fried Potatoes with Melted Cheese", "appetizer", "2024-08-19");
        MenuItem itemThree = new MenuItem("Tiramisu", 19.99, "Yummy", "dessert", "1973-08-19");
        MenuItem itemFour = new MenuItem("Pizza", 12.99, "Circle with Pepperoni", "entree", "1976-06-13");
        MenuItem itemFive = new MenuItem("Hot Broth", 99.99, "Heated up Broth in a Cup", "appetizer","1996-10-04");
        MenuItem itemSix = new MenuItem("Cheesecake", 8.99, "Very Cheezy", "dessert", "2024-09-16");

        Menu menu = new Menu();

        menu.addDish(itemOne);
        menu.addDish(itemTwo);
        menu.addDish(itemThree);
        menu.addDish(itemFour);
        menu.addDish(itemFive);
        menu.addDish(itemSix);

        System.out.println(menu);

        menu.removeDish(itemFive);

        System.out.println(menu);

        MenuItem itemSeven = new MenuItem("Tiramisu", 19.99, "Yummy", "dessert","1973-08-19");
        menu.addDish(itemSeven);

        System.out.println(menu);

    }
}