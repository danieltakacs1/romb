import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombTest {

    Romb romb;

    @BeforeTest
    public void testCalc() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcArea(){
        double actual = this.romb.calcArea(20);
        double expected = 40;
        Assert.assertEquals(actual, expected, 0.1, "Hiba!");
    }
}
