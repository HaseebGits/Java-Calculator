import org.mockito.Mockito;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MockitoTest {
    @Test
    public void testOperationWithMoke(){
        Calculator mockedCalculator = Mockito.mock(Calculator.class);
        Main mainApp = new Main();
        Mockito.when(mockedCalculator.addition(0.0,0.0)).thenReturn(0.0);
        double result=mainApp.performOperation(mockedCalculator,0.0,0.0,"+");
        assertEquals(0.0,result);
    }
}
