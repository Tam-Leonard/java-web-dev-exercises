package exercises.technology.Main;

public class Computer extends AbstractEntity{ //the abstractentity is brought over to the computer class
//add 3 properties, 2 methods, and a constructor
    //class variables (properties (that computers, smartphones, and laptops share))
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear; //could store as an int or String chose to do String

    //constructor
    public Computer(int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }
    //methods (two methods a computer might have: 1st processing 2+2, 2nd tell me a joke but won't
    // return anything. it's just going to print a joke to the screen)
    //added getters for Test (always go at the top)

    public int getScreenWidth() { return this.screenWidth; }
    public int getScreenHeight() { return screenHeight; }
    public String getManufactureYear() { return manufactureYear; }

    public int processTwoPlusTwo() {
        //this is going to add 2 plus two and return an int
        return 2 + 2;
    }
    public void tellMeAJoke() {
        System.out.println("What kind of overalls do Mario and Luigi wear? Denim, denim, denim!");
    }
}
