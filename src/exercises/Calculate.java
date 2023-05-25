package exercises;
import java.util.Scanner;

public class Calculate {
        public static void main(String[] args) {
            double length;
            double width;
            Scanner input;


            input = new Scanner(System.in);
            System.out.println("What is the length of a rectangle: ");
            length = input.nextDouble();



            input = new Scanner(System.in);
            System.out.println("What is the width of a rectangle: ");
            width = input.nextDouble();

            double area = length * width;
            System.out.println("The area of the rectangle is: " + area);

        }
}
