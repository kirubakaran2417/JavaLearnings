package unitTests;
import basics.Calculation;
import basics.Calculation2;
import org.junit.Assert;
import org.junit.Test;
public class CalculationTest {

   @Test
   public void test1() {
      Assert.assertEquals(140, Calculation2.add(30,20,30,20,50));
   }
}
