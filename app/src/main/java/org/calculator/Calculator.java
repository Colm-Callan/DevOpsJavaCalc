package org.calculator;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
    public double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 9, b = 3;
        System.out.println("add: " + calc.add(a, b));
        System.out.println("subtract: " + calc.subtract(a, b));
        System.out.println("multiply: " + calc.multiply(a, b));
        System.out.println("divide: " + calc.divide(a, b));
    }
}