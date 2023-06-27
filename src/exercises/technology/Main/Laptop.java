package exercises.technology.Main;

public class Laptop extends Computer {
    //    add at least 1 additional property and 1 additional method. Before that see below about error
    //class variables (properties (that a laptop has different than phone 1: we can use IntelliJ ))
    private boolean isIntelliJOpen;
     //Constructor
    //Did this 1st: was giving an error so needed to make a constructor to make the Computer parent happy
    //laptop extends from Computer so it needs to take in screen width, height, and manufacture year
    public Laptop(int screenWidth, int screenHeight, String manufactureYear) {
        //to call to the parent constructor - Computer.java file - we need to plug in super
        //then we plug in what the parent wants us to send back
        super(screenWidth, screenHeight, manufactureYear);
        //going to set boolean to false cos maybe we just opened our laptop
        this.isIntelliJOpen = false; //standard to put this. below the super. Super should always be
        //at the top of constructor
   }
    public Laptop(int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpen) {
        //ex of passing isIntelliJOpen into the constructor, then overload the constructor

        super(screenWidth, screenHeight, manufactureYear);
        this.isIntelliJOpen = isIntelliJOpen;
    }

    //Methods

    //set getter for test
    public boolean getIsIntelliJOpen() { return isIntelliJOpen; }
    //created setter for test, see notes on why
    public void setIntelliJOpen(boolean isIntelliJOpen) { this.isIntelliJOpen = isIntelliJOpen; }


    //1 additional method
    //this isn't going to return a
    // anything its going to set it to true and print
    public void openIntelliJ(){
        this.isIntelliJOpen = true;
        System.out.println("IntelliJ is now open.");
    }
}
