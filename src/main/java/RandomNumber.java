package src.main.java;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {
    public static void main (String[] args) {

        //Declaring random number
        int randomNumber = ThreadLocalRandom.current().nextInt(1,100);

        //Used for input in the console
        Scanner sc = new Scanner(System.in);

        //Declaring the variable in which the User will input a number
        int usersNumber;

        //Do-While Statement to determine if the user's input number is the random number
        do {
            System.out.println("Try to guess the number I've thought about. Enter the number you think it is: ");
            usersNumber = sc.nextInt(); //Using the Scanner to input the user's number of choice

            if(randomNumber > usersNumber) {
                System.out.println("The number you've entered is smaller than the number I thought about.");
            }
            else if(randomNumber < usersNumber) {
                System.out.println("The number you've entered is greater than the number I thought about.");
            }

        } while (randomNumber != usersNumber);

            System.out.println("Congratulations! you've guessed it, the number I thought about was: " + randomNumber);
    }
}
