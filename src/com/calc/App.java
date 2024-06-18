package com.calc;

public class App extends Calc {
    public void run() {
        String done = "no";
        while (done.equals("no")) {
            Input input = new Input();
            int type = input.inputIntDataFromTerminal("Enter 1 for Basic Operations/ Enter 2 for Complex Operations: ");
            switch (type) {
                case (1) -> { // For Basic Operations
                    int num1 = input.inputIntDataFromTerminal("Enter number to calculate");
                    String operator = input.inputStringDataFromTerminal("Enter Operator [+,-,*,/]: ");
                    if (operator.length() == 1 && (operator.contains("+") || operator.contains("-") || operator.contains("*") || operator.contains("/"))) {
                        int num2 = input.inputIntDataFromTerminal("Enter number to calculate");
                        int ans = calculate(operator, num1, num2);
                        System.out.println("Ans: " + ans);
                        done = input.inputStringDataFromTerminal("is that all? [yes/no]");
                    } else {
                        System.out.println("Please enter a valid operator next time");
                    }

                }
                case (2) -> { //For Complex Operations

                    String operator = input.inputStringDataFromTerminal("Select Operation [sqrt,%,^,log,log10x]: ");
                    if ((operator.equals("sqrt") || operator.equals("%") || operator.equals("^") || operator.equals("log") || operator.equals("log10x"))) {
                        switch (operator) {
                            case ("sqrt") -> {
                                int num1 = input.inputIntDataFromTerminal("Enter number: ");
                                double ans = sqrt(num1);
                                System.out.println("Ans: " + ans);
                            }
                            case ("^") -> {
                                int num1 = input.inputIntDataFromTerminal("Enter the first number : ");
                                int num2 = input.inputIntDataFromTerminal(num1 + " raised to the power of : ");
                                int ans = power(num1, num2);
                                System.out.println("Ans: " + ans);
                            }
                            case ("%") -> {
                                int num1 = input.inputIntDataFromTerminal("Find the Modulus of : ");
                                int num2 = input.inputIntDataFromTerminal("and (second number): ");
                                int ans = modulus(num1, num2);
                                System.out.println("Ans: " + ans);
                            }
                            case ("log") -> {
                                int num1 = input.inputIntDataFromTerminal("Find the log of : ");
                                double ans = log(num1);
                                System.out.println("Ans: " + ans);
                            }
                            case ("log10x") -> {
                                int num1 = input.inputIntDataFromTerminal("Enter value for x: ");
                                double ans = log10(num1);
                                System.out.println("Ans: " + ans);
                            }
                        }


                        done = input.inputStringDataFromTerminal("is that all? [yes/no]");
                    } else {
                        System.out.println("Please enter a valid operator next time");
                    }
                }
            }


        }


    }

}
