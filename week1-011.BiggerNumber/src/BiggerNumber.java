// Exercise 11: Biggest Number
// Create a program that asks the user for two integers and then prints
// the larger of the two.

import java.util.Scanner;
import java.lang.Math;


public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a numer: ");
        int number1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        System.out.println("The bigger number of the two numbers given was: " + Math.max(number1, number2)); // Math.max returns the bigger value of the two numbers.
    }
}