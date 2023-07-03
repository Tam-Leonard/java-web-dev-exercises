package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Topping extends Ingredient{
    //Class Variable (if we wanted to add a class variable called tastiness)
    private int tastiness;

    public Topping(String aName, double aCost, ArrayList<String> someAllergens, int tastiness) {
        super(aName, aCost, someAllergens);
        this.tastiness = tastiness;
    }

    //Getter/Setter for tastiness
    public int getTastiness() { return this.tastiness; };
    public void setTastiness(int tastiness) { this.tastiness = tastiness; };
}
