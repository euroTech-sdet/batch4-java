package com.days.day24;

public class OverloadOperators {
    public static void main(String[] args) {

        // create a method 2 integer parameter and 1 char  operators + - * /
        // create a switch statement iup to the char value
        //return the value
        // overload the method with different type of parameter  double
        operations(40, 20, '+');
        operations(40, 20, '-');
        operations(40, 20, '*');
        operations(40, 20, '/');
        operations(90, 30, "*");
        operations(10, 5, "+");
        operations(200, 50, "-");
        operations(200, 50, "/");
        operations("Subtract", 200, 100);
        operations("Addition", 200, 100);
    }

    public static int operations(int a, int b, char operator) {
        switch (operator) {
            case '+':// if the operator value equals +
                System.out.println(a + b);
                return a + b;
            case '-':
                System.out.println(a - b);
                return a - b;
            case '*':
                System.out.println(a * b);
                return a * b;
            case '/':
                System.out.println(a / b);
                return a / b;
            default:
                System.out.println(a * a + b * b);
                return a * a + b * b;
        }
    }

    public static int operations(int a, int b, String operator) {// addition division subtract multiplication
        int result;
        switch (operator) {
            case "+":// if the operator value equals +
                System.out.println(a + b);
                result = a + b;
                break;
            case "-":
                System.out.println(a - b);
                result = a - b;
                break;
            case "*":
                System.out.println(a * b);
                result = a * b;
                break;
            case "/":
                System.out.println(a / b);
                result = a / b;
                break;
            default:
                System.out.println(a * a + b * b);
                result = a * a + b * b;
        }
        return result;
    }

    public static int operations(String operator, int a, int b) {// addition division subtract multiplication
        int result;
        switch (operator) {
            case "Addition":// if the operator value equals +
                System.out.println(a + b);
                result = a + b;
                break;
            case "Subtract":
                System.out.println(a - b);
                result = a - b;
                break;
            case "Multiplication":
                System.out.println(a * b);
                result = a * b;
                break;
            case "Division":
                System.out.println(a / b);
                result = a / b;
                break;
            default:
                System.out.println(a * a + b * b);
                result = a * a + b * b;
        }
        return result;
    }


}
