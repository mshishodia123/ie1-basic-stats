import org.junit.Test;
import static org.junit.Assert.*;

public class StatsCalculationTest {
    private static double EPS = 1e-9;

    @Test
    public void testCentralTendency() {
        double[] numbers = {2, 2, 3, 3, 3, 4, 4};
        double mean   = StatsCalculation.mean(numbers);
        assertEquals (3, mean, EPS);
        double median = StatsCalculation.median(numbers);
        assertEquals (3, median, EPS);
        double mode   = StatsCalculation.mode(numbers);
        assertEquals (3, mode, EPS);
    }

    @Test
    public void testMean() {
      double[] numbers = {9, 11, 1, 4, 7, 21};
      double mean = StatsCalculation.mean(numbers);
      assertEquals (8.83333333333, mean, EPS);

      double[] numbers2 = {9, 1, 4, 7, 21};
      mean = StatsCalculation.mean(numbers2);
      assertEquals (8.4, mean, EPS);

      double[] numbers3 = {21};
      mean = StatsCalculation.mean(numbers3);
      assertEquals (21, mean, EPS);

      double[] numbers5 = {20, 10};
      mean = StatsCalculation.mean(numbers5);
      assertEquals (15, mean, EPS);
    }

    @Test
    public void testMedian() {
      //Median should be 8.0 since size is even
      /* double[] numbers = {1, 4, 7, 9, 11, 21}; */
      double[] numbers = {9, 11, 1, 4, 7, 21};

      double median = StatsCalculation.median(numbers);
      assertEquals(8.0, median, EPS);

      //Median should be 7 since size is odd
      double[] numbers2 = {9, 1, 4, 7, 21};
      median = StatsCalculation.median(numbers2);
      assertEquals(7, median, EPS);

      //Median should be 3 since size is 1
      double[] numbers3 = {3};
      median = StatsCalculation.median(numbers3);
      assertEquals(3, median, EPS);

      //Median should be 0 since size is 0
      double[] numbers4 = {};
      median = StatsCalculation.median(numbers4);
      assertEquals(0, median, EPS);
    }

    @Test
    public void testMode() {
      //Mode should be 1 since we are taking the first mode
      double[] numbers = {1, 4, 7, 9, 11, 21};
      double mode = StatsCalculation.mode(numbers);
      assertEquals (1, mode, EPS);

      //Mode should be 4
      double[] numbers2 = {1, 4, 4, 7, 9, 11, 21};
      mode   = StatsCalculation.mode(numbers2);
      assertEquals (4, mode, EPS);

      //Mode should be 7
      double[] numbers3 = {4, 4, 7, 7, 7, 11, 11};
      mode   = StatsCalculation.mode(numbers3);
      assertEquals (7, mode, EPS);

      //Mode should be 7
      double[] numbers4 = {7};
      mode   = StatsCalculation.mode(numbers4);
      assertEquals (7, mode, EPS);

      //Mode should be 0
      double[] numbers5 = {};
      mode   = StatsCalculation.mode(numbers5);
      assertEquals (0, mode, EPS);
    }
}
