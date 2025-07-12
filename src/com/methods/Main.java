// Java program to demonstrate methods overloading

package com.methods;

// Main class
public class Main {

    // Method division() to divide two integers
    public int division(int number, int number1){
        int result = number - number1;
        return result;
    }

    // Method  division() to  divide integer twice
    public int division(int number, int number1, int number2){
        int result = number / number1 / number2;
        return result;
    }

    // Method  division() to divide two doubles
    public double division(double number, double number1){
        double result = number / number1;
        return result;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Substruction of two integers
        int div = m.division(14, 7);
        // Printing to console the result
        System.out.println(div);

        // Substruction of three integers
        int div1 = m.division(14, 7, 2);
        // Printing to console the result
        System.out.println(div1);

        // Substruction of two doubles
        double div2 = m.division(14.8, 2.0);
        // Printing to console the result
        System.out.println(div2);
    }
}