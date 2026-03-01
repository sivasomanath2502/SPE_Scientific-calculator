package com.siva;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorServiceTest {

    CalculatorService calculator = new CalculatorService();

    @Test
    void testSquareRootPositive(){
        assertEquals(4.0,calculator.squareRoot(16));
    }

    @Test
    void testSquareRootZero(){
        assertEquals(0,calculator.squareRoot(0));
    }

    @Test
    void testSquareRootNegative(){
        assertThrows(IllegalArgumentException.class,()->{
            calculator.squareRoot(-9);
        });
    }

    @Test
    void testFactorialPositive(){
        assertEquals(120,calculator.factorial(5));
    }

    @Test
    void testFactorialZero(){
        assertEquals(1,calculator.factorial(0));
    }

    @Test
    void testFactorialNegative(){
        assertThrows(IllegalArgumentException.class,() -> {
            calculator.factorial(-3);
        });
    }
}
