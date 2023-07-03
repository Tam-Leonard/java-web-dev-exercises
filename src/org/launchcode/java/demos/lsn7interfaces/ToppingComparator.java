package org.launchcode.java.demos.lsn7interfaces;
//BONUS MISSION
import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping o1, Topping o2) {
        //inline subtraction on the return to simplify so we don't need an if statement like the others
        return o2.getTastiness() - o1.getTastiness(); //at first it was o1 -o2 then we wanted to sort from
        //high to low so switched o2 - 01
        //then go over to Main to implement
    }
}
