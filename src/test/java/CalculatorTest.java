import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator(6,3);
    }

    @Test
    public void canAdd(){
        assertEquals(9, calc.addNumbers());
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calc.subtractNumbers());
    }

    @Test
    public void canMulitply(){
        assertEquals(18, calc.multiplyNumbers());
    }

    @Test
    public void canDivide(){
        assertEquals(2, calc.divideNumbers());
    }
}
