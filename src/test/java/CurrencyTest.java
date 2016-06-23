import currency.Dollar;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lucz on 23.06.16.
 */
public class CurrencyTest {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        Assert.assertEquals(10, five.amount);
    }
}
