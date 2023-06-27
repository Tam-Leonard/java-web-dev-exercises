package exercises.technology.Main;

public class SmartPhone extends Computer {
    //    add at least 1 additional property and 1 additional method. Before that see below about error

    //Class variables (properties(something unique to phones connected to 5G))
    private boolean isConnectedTo5G;

    //Constructors
    //Did  this first: was giving an error so needed to make a constructor to make the Computer parent happy
    //SmartPhone extends from Computer so it needs to take in screen width, height, and manufacture year
    public SmartPhone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnectedTo5G) {
        //to call to the parent constructor - Computer.java file - we need to plug in super
        //then we plug in what the parent wants us to send back
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }

    //Methods

    //getter for test
    public boolean getIsConnectedTo5G() { return isConnectedTo5G; }

    //1 additional method
    public void makeAPhoneCall(String number) {
        System.out.println("Calling: " + number);
    }

}