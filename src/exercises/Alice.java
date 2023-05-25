package exercises;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Search for a term: ");
        String searchTerm = scanner.nextLine().toLowerCase();

        boolean found = sentence.toLowerCase().contains(searchTerm);
        System.out.println("Search term found: " + found);

        if (found) {
            int index = sentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            int length = searchTerm.length();

            System.out.println("Index: " + index);
            System.out.println("Length: " + length);

            // Remove the word from the sentence
            sentence = sentence.replaceFirst("(?i)" + searchTerm, "");

            System.out.println("Updated sentence: " + sentence);
        }
    }
}
 /* Kyle's way:
 public class Alice {

    public static void main(String[] args) {
        Alice myFirstAlice = new Alice();
        String searchTerm = myFirstAlice.getUsersSearchTerm();
        Boolean myFirstAlice.searchAliceQuote( searchTerm );
        //step 5 prt 2 if conditional:
          if ( myReturnedResult == true) {
            myFirstAlice.getWordsIndex(searchTerm);
            myFirstAlice.removeWordFromQuote(searchTerm);
        }
        System.out.println("The result is: " + myReturnedResult.toString());
    }

    //Step 5 part 3:
        public void removeWordFromQuote(String searchTerm) {

        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        //use substring method to remove a section from a string.
        int startingPoint1 = 0;
        int endingPoint1 = theQuote.toLowerCase.indexOf(searchTermLowerCase);
        int startingPoint2 = theQuote.toLowerCase.indexOf(searchTermLowerCase) + searchTermLowerCase.length();
        //int endingPoint2 = if we don't have a specific ending  point, we can keep it out of here. Don't need it.

       String ourNewQuote = theQuote.substring(startingPoint1, endingPoint1 ) + theQuote.subString(startingPoint2);

       System.out.println("The new quote is: " + ourNewQuote);

        }


    //step 5 pt 1:
    public void getWordsIndex( string searchTerm ) {

    String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        int theIndex = theQuoteLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index is: " + theIndex + "and the length is " + searchTermLowerCase.length());

    }

    public String getUsersSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        String searchTerm = scanner.nextLine();
        scanner.close();
        return searchTerm;
    }

    public boolean = searchAliceQuote(String searchTerm) {
        String theQuote = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        String theQuoteLowerCase = theQuote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        Boolean result = theQuoteLowerCase.contains(searchTermLowerCase);
        return result;
    }
 }




 *  */