package org.launchcode.java.resturantMenuStudio;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class variables
    private ArrayList<menuItems> menuItems = new ArrayList <>();
    private Date lastUpdated;

    //Constructors

    public Menu() {
        this.lastUpdated = new Date();
    }

    //Methods
    public ArrayList<menuItems> getMenuItems() { return this.menuItems; }
    public void setMenuItems(ArrayList<menuItems> menuItems) { this.menuItems = menuItems; }

    public Date getLastUpdated() { return this.lastUpdated; }
    public void setLastUpdated(Date lastUpdated) { this.lastUpdated = lastUpdated; }
}
