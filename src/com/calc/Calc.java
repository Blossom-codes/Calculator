package com.calc;

public class Calc extends Operation {

    public int calculate(String operator, int num1, int num2) {
        int result = 0;
        switch (operator) {
            case "+" -> result = add(num1, num2);
            case "-" -> result = subtract(num1, num2);
            case "*" -> result = multiply(num1, num2);
            case "/" -> result = division(num1, num2);
            default -> {
            }
        }
       return result;
    }




}
