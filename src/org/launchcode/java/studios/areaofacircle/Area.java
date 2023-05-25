package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter radius: ");
        //Bonus Mission: a non-numeric character? Is a try/catch statement
        //the empty string? there was nothing we needed to do here the code already recognizes this
        try {
            boolean keepLooping = true;
            while(keepLooping) {
                double radius = input.nextDouble();

                //Bonus Mission: Checking if its a neg number
                if (radius < 0) {
                    //print error to the user
                    //Bonus Mission: while or do-while loop, so that when the
                    // user enters a negative number they are re-prompted.
                    System.out.println("You can not enter a negative number!");
                } else {
                    //continue as normal
                    //Math.PI and PI didn't work so I used the number
                    double area = Circle.getArea(radius);
                    //2.5 next task Back in Area, replace your area calculation line with a call to Circle.getArea().
                    // deleted previous code 3.14 * radius * radius
                    //radius inside b/c that's what I called it in double part
                    System.out.println("The area of a circle of radius " + radius + " is: " + area);

                    //where to tell the while loop to exit set the flag to false
                    //keep looping until false
                    keepLooping = false;
                }
            }
        } catch(Exception error) {
            System.out.println("You must provide a numeric input!");
        }
        input.close();
    }
}
