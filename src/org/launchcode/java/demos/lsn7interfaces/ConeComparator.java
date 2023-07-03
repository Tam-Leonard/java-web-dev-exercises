package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone o1, Cone o2) {
        //the Comparator has to return a positive integer if o1 is greater than o2
        //Negative integer if o1 is less than o2
        //Zero if o1 and o2 are equal

        //8.6.3.1. Troubleshooting got an error w/just this return o1.getCost() - o2.getCost(); need an if/else
        //then deleted the return o1.getCost() - o2.getCost(); once the if/else statement was created

        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if (o1.getCost() < o2.getCost()) {
            return -1;
        } else {
            return 0;
        }

    }
}
