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
        return 0;
    }
    public double power(double base,double exponent)
    {
        return 0;
    }
}
