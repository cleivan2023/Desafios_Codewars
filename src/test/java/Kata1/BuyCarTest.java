package Kata1;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class BuyCarTest {

    @Test
    public void Test1() {
        int[] r = new int[] { 6, 766 };
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
    }

    @Test
    public void Test2() {
        int[] r = new int[] { 0, 4000 };
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
    }
}
