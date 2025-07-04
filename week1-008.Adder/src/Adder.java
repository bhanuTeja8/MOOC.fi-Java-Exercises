// Exercise 8: Adder
// Create a program that asks the user for two integers and then prints the sum.

import java.util.Scanner; // Import scanner utility to read input from user.

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Initialise scanner to read system input from user.
        
        System.out.println("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine()); // Parses string argument in the next line as an integer.
             
        System.out.println("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
    
        System.out.println("Sum of the numbers: " + (number1 + number2));
    }
}