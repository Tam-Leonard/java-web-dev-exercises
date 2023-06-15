package org.launchcode.java.resturantMenuStudio.resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class variables
    private ArrayList<MenuItem> menuItems = new ArrayList <>();
    private Date lastUpdated;

    //Constructors

    public Menu() {
        this.lastUpdated = new Date();
    }

    //Methods
    public ArrayList<MenuItem> getMenuItems() { return this.menuItems; }
    public void setMenuItem(ArrayList<MenuItem> menuItem) { this.menuItems = menuItem; }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }

    //5.6 Studio Begin////
public void addMenuItem(MenuItem item) {
        //add to list of menu items
        this.menuItems.add(item);

        //Update lastUpdated property (class variable)
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        //remove item from list
        this.menuItems.remove(item);
        //this is going to go through every item on the list to see which item is not on thelist
        //then remove it

        //update last updated property
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        //loop through each menu item and print them
        //for menuItem in list of MenuItems
        for (MenuItem item : this.menuItems) {
            //menuItem.printOutMenuItem();
            returnString += item.toString() + "\n\n";
        }

        return returnString;
    }
}
