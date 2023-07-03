package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {
        //return o1.getName().compareTo(o2.getName());
        //above was code for main task commented out for bonus mission

        /*Begin bonus mission:
        sort Flavor objects by the number of allergens, from highest to lowest
        the Comparator has to return:
        - a negative integer if o1 is greater than o2
       - positive integer if o1 is less than o2
        -the Comparator has to return a negative integer if o1 is greater than o2
       - positive integer if o1 is less than o2
       - Zero if o1 and o2 are equal
     .  */
         if (o1.getAllergens().size() > o2.getAllergens().size()) {
             return -1;
         } else if (o1.getAllergens().size() < o2.getAllergens().size()){
             return 1;
        } else {
             return 0;
         }

    }
}
