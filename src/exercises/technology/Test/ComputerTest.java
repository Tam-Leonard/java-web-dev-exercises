package exercises.technology.Test;

import exercises.technology.Main.Computer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

//add three JUnit tests per class
public class ComputerTest {

    //can use @Before tag
    Computer myComputer;
    @Before
    public void beforeTest() {
        myComputer = new Computer(3000, 5000, "2022");
    }

    @Test
    public void constructorSetValuesTest() {
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(5000, this.myComputer.getScreenHeight());
        assertEquals("2022", this.myComputer.getManufactureYear());

    }

    @Test
    public void twoPlusTwoReturnsFour() {
        int result = this.myComputer.processTwoPlusTwo();
        assertEquals(4, result);

    }
}
