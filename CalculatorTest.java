import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
   public void TestDivideByZero(){
        Calculator c =new Calculator();
        assertThrows(ArithmeticException.class,() -> c.divide(10,0));
    }

}