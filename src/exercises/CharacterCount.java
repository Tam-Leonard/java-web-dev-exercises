package exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        //Bonus Task 1:
        Scanner input = new Scanner (System.in);

        System.out.println("Enter phrase: ");

        //Bonus Task 2: toLowerCase() was added at the end of here it wasn't there before
        String quote = input.nextLine().toLowerCase();
        //End Bonus Task 1 & 2

        //Main Task
        //not returning anything, it's void
        //from class studio
        //right click line text is on and click soft wrap
        /*String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that " +
                "side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";*/

        char[] charctersInString = quote.toCharArray();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for ( char letter : charctersInString){
            //System.out.println(letter); test

            //Bonus Task 3: Use Continue
                if(Character.isAlphabetic(letter)){
                    continue;
                }
            //End Bonus Task 3

            //initialize the counts for the characters
            //if the letter does not exist in letter count
            if ( !letterCount.containsKey(letter)){
                //intitalize it to 1
                letterCount.put(letter, 1);

            } else {
                //else
                //increment letter count to 1
                letterCount.put(letter, letterCount.get(letter) +1);

            }

        }
        //task4
        for (Map.Entry<Character, Integer> letterEntry: letterCount.entrySet()) {
            System.out.println(letterEntry.getKey() + ": " + letterEntry.getValue());
        }


    }
}

/*Lecture notes:
arraylist .get will show index of an item that was added to an array list.
put() adds to Hash map
Attendance: Control&Flow
*/

