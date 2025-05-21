package ss9.BaiTap.NextDay;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NextDayCalculatorTest {

    @Test
    public void testNextDay_1_1_2018() {
        int[] result = NextDayCalculator.findNextDay(1, 1, 2018);
        assertArrayEquals(new int[]{2, 1, 2018}, result);
    }

    @Test
    public void testNextDay_31_1_2018() {
        int[] result = NextDayCalculator.findNextDay(31, 1, 2018);
        assertArrayEquals(new int[]{1, 2, 2018}, result);
    }

    @Test
    public void testNextDay_28_2_2018() {
        int[] result = NextDayCalculator.findNextDay(28, 2, 2018);
        assertArrayEquals(new int[]{1, 3, 2018}, result);
    }

    @Test
    public void testNextDay_29_2_2020() {
        int[] result = NextDayCalculator.findNextDay(29, 2, 2020);
        assertArrayEquals(new int[]{1, 3, 2020}, result);
    }

    @Test
    public void testNextDay_31_12_2018() {
        int[] result = NextDayCalculator.findNextDay(31, 12, 2018);
        assertArrayEquals(new int[]{1, 1, 2019}, result);
    }
}
