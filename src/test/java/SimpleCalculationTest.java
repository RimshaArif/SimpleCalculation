import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class SimpleCalculationTest {
    private SimpleCalculation simpleCalculation;

    @Before
    public void setUp() {
       simpleCalculation = new SimpleCalculation();
    }

    @Test
    public void multiply() {
        int result = simpleCalculation.multiply(2, 4);

        assertThat(result, equalTo(8));
    }

    @Test
    public void subtract() {
        int result = simpleCalculation.subtract(4, 2);

        assertThat(result, equalTo(2));
    }
}
