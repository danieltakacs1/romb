import java.util.InputMismatchException;

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
    public void testCalcArea_20_40(){
        double actual = this.romb.calcArea(20, 40);
        double expected = 257.1;
        Assert.assertEquals(actual, expected, 0.1, "Hiba!");
    }
    @Test
    public void testCalcPerimeter_30(){
        double actual = this.romb.calcPerimeter(30);
        double expected = 120;
        Assert.assertEquals(actual, expected, 0.1, "Hiba!");
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCaclArea_Zero_Angle() {
        this.romb.calcArea(1, 0);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCaclPerimeter_Zero_Side() {
        this.romb.calcPerimeter(0);
    }
}
