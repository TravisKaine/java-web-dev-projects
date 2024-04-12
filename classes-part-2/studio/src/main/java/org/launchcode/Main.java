package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pepperoni Pizza", "Classic slice of Pizza!", 6.99, "MAIN COURSES");
        MenuItem item2 = new MenuItem("Apple Pie", "American Classic", 3.99, "DESSERTS");
        MenuItem item3 = new MenuItem("Cheeseburger", "Can never go wrong with a burger", 8.99, "MAIN COURSES");
        MenuItem item4 = new MenuItem("Chocolate Cake", "Little slice of heaven", 5.99, "DESSERTS");
        MenuItem item5 = new MenuItem("Loaded Fries", "They said we couldn't fit all of this on a basket of fries, they were wrong", 4.99, "APPETIZERS");


        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);


        //menu.removeItem();

        //menu.addItem(new MenuItem());

        System.out.println(menu);



    }
}
