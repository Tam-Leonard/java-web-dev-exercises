package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import org.junit.Before;
import static org.junit.Assert.fail;

public class CarTest {

    Car test_car;

    @Before
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
        }


    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
        }
    //TODO: constructor sets gasTankLevel properly
        @Test
        public void testInitialGasTank() {
            Car test_car = new Car("Toyota", "Prius", 10, 50);
            assertEquals(10, test_car.getGasTankLevel(), .001);
        }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
     public void testGasTankAfterDriving() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
        }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange(){
        //You’ll need to simulate the Car travelling farther than it’s gasTankLevel allows
        /* go over to Car.java in the car class constructor to take in the make and model, gas
        * tank size, then miles per gallon. The tank size and miles per gallon will give us what
        * we need to know. So miles per gallon * tank size = how many miles the car can go
        * Then go up to the @Before statement to see what we're setting our miles per gallon to
        * and our tank size in the constructor In our @Before statement we see gasTankSize = 10
        * and milesPerGallon = 50. So, 10 * 50 = 500 miles*/
        //Total Miles = miles per gallon * tank size
        //Total Miles we can travel is 500 this is the tank range. We want to know what happens
        //if we exceed the tank range
        //Expected odometer after all of this is 500 when the tank is empty.
        //we set to 600 b/c we want to push it to the limit or break it to see what it does
        //Then make sure the odometer stays at 600 So, we assert equals our odo reading

        test_car.drive(600);
        assertEquals(500, test_car.getOdometer(), .001);
        }
    //TODO: can't have more gas than tank size, expect an exception
@Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        // implement the new addGas() method and a fail() scenario.
        //requires to import fail see above
    test_car.addGas(5);
    fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");

    }
}
