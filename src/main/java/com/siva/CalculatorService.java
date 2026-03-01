package com.siva;

public class CalculatorService {
    public double squareRoot(double x)
    {
        if(x<0){
            throw new IllegalArgumentException("Negative input not allowed");
        }
        return Math.sqrt(x);
    }
    public long factorial(int x)
    {
        if(x<0){
            throw new IllegalArgumentException("Negative input not allowed");
        }
        long result = 1;
        for(int i=1;i<=x;i++){
            result *= i;
        }

        return result;
    }
    public double naturalLog(double x)
    {
        if(x<=0){
            throw new IllegalArgumentException("Input must be positive");
        }
        return Math.log(x);
    }
    public double power(double base,double exponent)
    {
        return Math.pow(base,exponent);
    }
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return a / b;
    }

    public int modulus(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Modulus by zero not allowed");
        }
        return a % b;
    }

    public double absolute(double x) {
        return Math.abs(x);
    }

    public double exponential(double x) {
        return Math.exp(x);
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }
}
