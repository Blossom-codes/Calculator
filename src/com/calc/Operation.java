package com.calc;

public class Operation implements Complex {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int division(int num1, int num2) {
        int result = 0;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
//            throw new ArithmeticException("Denominator cannot be 0, Try again")
            System.out.println("Denominator cannot be 0, Try again");
        }
        return result;
    }
    @Override
    public double sqrt(int num) {
        return Math.sqrt(num);
    }

    @Override
    public int power(int num1, int num2) {
        return (int)Math.pow(num1,num2);
    }

    @Override
    public int modulus(int num1, int num2) {
        return num1%num2;
    }

    @Override
    public double log(int num1) {
        return Math.log(num1);
    }

    @Override
    public double log10(int x) {
        return Math.log10(x);
    }

}
