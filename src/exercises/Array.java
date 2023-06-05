package exercises;
import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        int[] myArray = {1, 1, 2, 3, 5, 8};
        //https://stackabuse.com/how-to-declare-and-initialize-an-array-in-java/

        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 != 0) {
                System.out.println(myArray[i]);
            }
            //This loops through array single line
            //https://medium.com/javarevisited/7-different-ways-to-loop-through-an-array-in-java-e0d04245c6aa

            //this only pints odd numbers
            //https://www.javatpoint.com/java-program-to-display-odd-numbers-from-1-to-100
        }
        /*String s1 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = s1.split("\\s");
        for (String w : words) {
            System.out.println(w);
        } Doesn't array the thing https://www.javatpoint.com/java-string-split*/

        //book solution doesn't work b/c the word arrays is red
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        //alt way: This one worked https://www.geeksforgeeks.org/java-program-to-convert-string-to-string-array/
        //String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        //String strArray[] = str.split(" ");

        //System.out.println("String : " + str); commented out b/c it prints phrase. I don't want that
        //System.out.println("String array : [ ");

        //for (int i = 0; i < strArray.length; i++) {
            // Printing the elements of String array
           // System.out.print(strArray[i] + ", ");
        //}

        //System.out.print("]" + System.lineSeparator());
        //I needed to seperate the line. I used this https://stackoverflow.com/questions/7833689/how-can-i-print-a-string-adding-newlines-in-java

        //number 5 part 1 solution from book: Okay, the word Arrays is not red anymore b/c I read the error box
        //and it asked if I wanted to import Arrays to class or something. the code below works and so should the
        //books solution
        //String[] sentences = str.split("\\.");
        //System.out.println(Arrays.toString(sentences));

        /*Update for ArrayListPrac Bonus doesn't work b/c red line moving on
        public String[] splitString() {
            String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] words = phrase.split(" ");
            //System.out.println(Arrays.toString(words));
            return words;
        }*/

    }

}