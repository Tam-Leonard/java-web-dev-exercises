package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Bonus mission: implement toppings
        ArrayList<Topping> toppings = menu.getToppings();

        /* 8.6.2.2. Sorting the flavors ArrayList
        Iterating through the flavors list before and after the sort shows the results.
         (The output below displays just the name fields).
         for each loop below to print out flavor name before it's sorted
         then copy and put under the Comparator
         */
        System.out.println("Before sort: ");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
            //updated for bonus mission:
            //before bonus mission it read: System.out.println(flavor.getName())
        }

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

        System.out.println("After sort: ");
        for(Flavor flavor : flavors) {
            System.out.println(flavor.getName() + " # of allergens: " + flavor.getAllergens().size());
            //Copy/paste print line from above for bonus mission
        }
        //Before sort
        System.out.println("\n\n Before sort: ");
        for (Cone cone : cones) {
            System.out.println("$" + cone.getCost());
        }
        //After sort
        cones.sort(new ConeComparator());

        System.out.println("\n\n After sort: ");
        for(Cone cone : cones) {
            System.out.println("$" + cone.getCost());
        }

        //BONUS Mission for toppings

        //Before sort
        System.out.println("\n\n Before sort: ");
        for (Topping topping : toppings) {
            System.out.println(topping.getName() + " Tastiness: "  + topping.getTastiness());
        }
        //After sort
        toppings.sort(new ToppingComparator());

        System.out.println("\n\n After sort: ");
        for(Topping topping : toppings) {
            System.out.println(topping.getName() + " Tastiness: "  + topping.getTastiness());
        }
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
