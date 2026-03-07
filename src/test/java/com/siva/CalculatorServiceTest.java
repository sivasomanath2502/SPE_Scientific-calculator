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

    @Test
    void testNaturalLogPositive(){
        assertEquals(Math.log(10),calculator.naturalLog(10),0.0001);
    }
    @Test
    void testNaturalLogOne(){
        assertEquals(0.0,calculator.naturalLog(1),0.0001);
    }
    @Test
    void testNaturalLogZero(){
        assertThrows(IllegalArgumentException.class,() -> {
            calculator.naturalLog(0);
        });
    }
    @Test
    void testNaturalLogNegative(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.naturalLog(-5);
        });
    }

    @Test
    void testPowerPositive(){
        assertEquals(16,calculator.power(4,2));
    }
    @Test
    void testPowerZero(){
        assertEquals(1,calculator.power(5,0));
    }
    @Test
    void testPowerNegative(){
        assertEquals(0.25,calculator.power(2,-2));
    }

    @Test
    void testAddition(){
        assertEquals(8,calculator.add(5,3));
    }

    @Test
    void testSubstraction(){
        assertEquals(2,calculator.subtract(5,3));
    }

    @Test
    void testMultiply(){
        assertEquals(15,calculator.multiply(5,3));
    }

    @Test
    void testDivision(){
        assertEquals(2.0,calculator.divide(6,3),0.0001);
    }

    @Test
    void testDivisionByZero(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(5,0);
        });
    }

    @Test
    void testModulus() {
        assertEquals(0,calculator.modulus(10, 3));
    }

    @Test
    void testModulusByZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.modulus(5, 0);
        });
    }

    @Test
    void testAbsolute() {
        assertEquals(5, calculator.absolute(-5));
    }

    @Test
    void testExponential() {
        assertEquals(Math.exp(2), calculator.exponential(2), 0.0001);
    }

    @Test
    void testMax() {
        assertEquals(10, calculator.max(10, 3));
    }
}
