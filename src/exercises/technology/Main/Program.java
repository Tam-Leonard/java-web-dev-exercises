package exercises.technology.Main;


//Class implementation: Implement your design and test it in a Program.java class.
public class Program {
    /* need a start to our project we create a main to test the project.
     we want to have the starting point in a class by itself
    we know where the starting point is and we can do all of our test and coding inside of this
    program that works with the other classes that were just built: Computer, Laptop, smartPhone
    */
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone( 1500, 500,"2021", true);
       // mySmartPhone.makeAPhoneCall("816-321-2277");
        //int result = mySmartPhone.processTwoPlusTwo();
        //System.out.println("The result is: " + result);//calling to the computer method
        //this is an ex of how we use the parent method to call to one of the children classes
        System.out.println(mySmartPhone.getId());

        Laptop myLaptop = new Laptop(2500, 1500, "2021");
        //myLaptop.openIntelliJ();//tested calling out to this method
        //int result = myLaptop.processTwoPlusTwo();
        //System.out.println("Laptop result is: " + result);
        System.out.println(myLaptop.getId());

        Computer myComputer = new Computer(3000, 3000, "2021");
        //int computerResult = myComputer.processTwoPlusTwo();
        //System.out.println("Computer result is: " + computerResult);
        //Note: inheritance goes one way. Can't use myComputer.openIntelliJ() or myComputer.makePhoneCall("")
        System.out.println(myComputer.getId());

    }
}
