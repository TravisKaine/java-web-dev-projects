package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public String toString(){
             StringBuilder appetizers = new StringBuilder();
             for (MenuItem item: menuItems){
                 if (item.getCategory().equals("APPETIZERS")){
                appetizers.append("\n").append(item).append("\n");
                 }
             }

            StringBuilder mainCourses = new StringBuilder();
            for (MenuItem item: menuItems) {
                if (item.getCategory().equals("MAIN COURSES")) {
                    mainCourses.append("\n").append(item).append("\n");
                }
            }
            StringBuilder DESSERTS = new StringBuilder();
            for (MenuItem item: menuItems){
                if (item.getCategory().equals("DESSERTS")){
                    DESSERTS.append("\n").append(item).append("\n");
                }
            }
    return  "\n" + "HUNGRY BUCKET INC \n" + "\n" +
            "APPETIZERS" + appetizers + "\n" +
            "MAIN COURSES" + mainCourses + "\n" +
            "DESSERTS" + DESSERTS + "\n";
}

    void addItem(MenuItem newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void  removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }
}


