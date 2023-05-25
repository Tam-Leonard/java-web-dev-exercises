package exercises;
import java.util.Scanner;


public class Miles {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double numMiles = input.nextDouble();

        System.out.println("How much gas did you use? In gallons.");
        Double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;
        System.out.println("You are running on " + mpg + " mpg.");
    }
}
/*alt way: The first way is the book solution this is Kyle's solution
* public class MilesPerGallon {
*
* public static void main(String[] args) {
* //this was written after the rest of the code was compiled
* MilesPerGallon milesPerGallon = new MilesPerGallon()'
* milesPerGallon.calculateMilesPerGallon();
* }
*
* public void calculateMilesPerGallon() {
* Scanner scanner = new Scanner(System.in);
*
* System.out.println("How many miles have you driven?");
* Double milesDriven = scanner.nextDouble();
*
* System.out.println("How much gallons of gas did your car consume? ");
* Double gallonsConsumed = scanner.nextDouble();
*
* Double milesPerGallon = milesDriven/gallonsConsumed
* System.out.println("Your miles per gallon is: " + milesPerGallon.toString());
*  }
* } */