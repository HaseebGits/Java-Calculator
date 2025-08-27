import org.mockito.Mockito;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MockitoTest {
    @Test
    public void testOperationWithMoke(){
        Calculator mockedCalculator = Mockito.mock(Calculator.class);
        Main mainApp = new Main();
        Mockito.when(mockedCalculator.addition(2.0,2.0)).thenReturn(5.0);
        double result=mainApp.performOperation(mockedCalculator,2.0,2.0,"+");
        assertEquals(5.0,result);
    }
}
