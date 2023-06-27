package exercises.technology.Test;

import exercises.technology.Main.Computer;
import exercises.technology.Main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;
    @Before
    public void beforeTest() {
        myLaptop = new Laptop(3000, 5000, "2022", true);
    }
    @Test
    public void constructorSetValuesTest() {
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(5000, this.myLaptop.getScreenHeight());
        assertEquals("2022", this.myLaptop.getManufactureYear());

    }
    @Test
    public void openIntelliJSetsIsIntelliJOpenToTrue() {
        //going to have hard time testing this b/c it's already set to true
        //so we have to create a setter to get to false before testing back to the laptop.java file
       this.myLaptop.setIntelliJOpen(false); //this sets isIntelliJOpen to false
        assertEquals(false, this.myLaptop.getIsIntelliJOpen());
       this.myLaptop.openIntelliJ(); //this sets it to true
       assertEquals(true, this.myLaptop.getIsIntelliJOpen()); //this will test if it's actually true by
        //using getter
    }
}
