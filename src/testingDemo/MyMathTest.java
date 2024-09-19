package testingDemo; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    @Test
    public void shouldReturnSum_whenAddingTwoNumbers() {
        assertEquals(5, MyMath.add(2, 3)); 
    }

    @Test
    public void shouldReturnPower_whenExponentPositive() {
        assertEquals(8, MyMath.power(2, 3)); 
    }

    @Test
    public void shouldReturn1_whenExponentZero() {
        assertEquals(1, MyMath.power(10, 0)); 
    }
    
    @Test
    public void shouldReturnResult_whenExponentNegative() {
        assertEquals(0.125, MyMath.power(2, -3)); 
    }
}
