package org.launchcode.java.resturantMenuStudio.resturant;

import java.awt.*;

public class Restaurant {
    public static void main (String[] args) {
        MenuItem item1 = new MenuItem( "Salad",   "Delicious Greens",     7.50,   "Healthy",   true);
        MenuItem item2 = new MenuItem("Salad", "Delicious Greens",   7.50, "Healthy", true);
        MenuItem item3 = new MenuItem("Cake", "Delicious desserts",  5.50, "Unhealthy", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);

        //delete menu item
        myMenu.removeMenuItem(item3);
        System.out.println(myMenu.toString());

        //print ind menu item to screen
        //System.out.println(item1.toString());

        //print entire menu out
        //System.out.println(myMenu.toString());

        //test out the toString method
        //System.out.println(item1.toString());

        //test equals method
        //System.out.println(item1.equals(item2));
        //System.out.println(item1.equals(item3));
    }

}
