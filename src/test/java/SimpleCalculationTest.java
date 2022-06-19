import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import org.hamcrest.MatcherAssert;

public class SimpleCalculationTest {
    private SimpleCalculation simpleCalculation;

    @Before
    public void setUp() {
       simpleCalculation = new SimpleCalculation();
    }

    @Test
    public void multiply() {
        int result = simpleCalculation.multiply(2, 4);

        MatcherAssert.assertThat(result, equalTo(8));
    }

    @Test
    public void divide() {
        int result = simpleCalculation.divide(4, 2);

        MatcherAssert.assertThat(result, equalTo(2));
    }

    @Test
    public void add() {
        int result = simpleCalculation.add(4, 2);

        MatcherAssert.assertThat(result, equalTo(6));
    }

    @Test
    public void subtract() {
        int result = simpleCalculation.subtract(4, 2);

        MatcherAssert.assertThat(result, equalTo(2));
    }
}
