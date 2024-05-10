package src.main.java;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

          //Used to input things in the Console
          Scanner sc = new Scanner(System.in);

          //Sending messages and declaring variables of the operation
          System.out.println("Choose the first number: ");
          double firstNumber = sc.nextDouble(); //Using the previous declared Scanner

          System.out.println("Choose the second number: ");
          double secondNumber = sc.nextDouble(); //Using the previous declared Scanner

          System.out.println("Choose the operator: ");
          String operation = sc.next(); //Using the previous declared Scanner

          double result = Calculate(firstNumber, secondNumber, operation); //Calling the function to calculate the operation

          System.out.println("The result of the operation is: " + result);
    }

    //Deciding the operation via switch statement
    public static double Calculate (double firstNumber, double secondNumber, String operation) {
         switch (operation) {
             case "+":
                 return sum(firstNumber, secondNumber);
             case "-":
                 return subtract(firstNumber, secondNumber);
             case "*":
                 return multiply(firstNumber, secondNumber);
             case "/":
                 return divide(firstNumber, secondNumber);
             default:
                 throw new IllegalArgumentException("Unknown Operation");
         }
    }

    //Function to sum
    public static double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    //Function to subtract
    public static double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    //Function to multiply
    public static double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    //Function to divide
    public static double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
