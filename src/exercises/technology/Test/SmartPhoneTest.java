package exercises.technology.Test;

import exercises.technology.Main.Laptop;
import exercises.technology.Main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone mySmartPhone;
    @Before
    public void beforeTest() {
        mySmartPhone = new SmartPhone(3000, 5000, "2022", true);
    }
    @Test
    public void constructorSetValuesTest() {
        assertEquals(3000, this.mySmartPhone.getScreenWidth());
        assertEquals(5000, this.mySmartPhone.getScreenHeight());
        assertEquals("2022", this.mySmartPhone.getManufactureYear());
        assertEquals(true, mySmartPhone.getIsConnectedTo5G());
    }

}
