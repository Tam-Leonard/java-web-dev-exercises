package exercises;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPrac {
    public static void main(String[] args) {


        /*Task 1:
        ArrayList<Integer> numToSum = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //Integer theSum = ArrayListPrac.sumEvenValues(numToSum);
        System.out.println("The sum is: " + theSum.toString());*/

        //Task 2:
        //ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList("apple", "orange", "mango", "pineapple"));
        //ArrayListPrac.printFiveLetterWord(wordsToSearch);

        //Task 3:
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList("apple", "orange", "mango", "pineapple"));
        System.out.println("Word length search: ");
        Integer searchLength = ArrayListPrac.userInput();
        ArrayListPrac.printFiveLetterWord(wordsToSearch, searchLength);

        //searchLength was added to Task 2 paramater and the if statement was == 5 but updated to searchLength

        /*Bonus:
        ForBouns copied line 22 and replaced words for "returnedWords" :
        ArrayList<String> wordsToSearch = new ArrayList<String>(Arrays.asList(returnedWords));

        Instead of creating our own list of words, what if we want to use the string from the Array Practice section?
        cont. Search “Java convert String to ArrayList” online to see how to split a string into the more flexible ArrayList collection.
        ArrayPractice arrayPractice = new ArrayPractice();
       String[] returnedWords = arrayPractice.splitString();*/
    }

    //Task 1:
    public static Integer sumEvenValues(ArrayList<Integer> valuesToSum) {
        Integer sum = 0;
        for (int i = 0; i < valuesToSum.size(); i++ ) {
            if(valuesToSum.get(i) %2 == 0){
                sum = sum + valuesToSum.get(i);
                //alt way: sum += valuesToSum.get(i);
            }
        }
        return sum;
    }

    //Task 2:
    public static void printFiveLetterWord(ArrayList<String> words, Integer searchLength) {
        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).length() == searchLength) {
                System.out.println(words.get(i));
            }
        }

    }

    //Task 3:
    public static Integer userInput() {
        Scanner input = new Scanner(System.in);
        Integer userInt = input.nextInt();
        input.close();
        return userInt;
    }
}
