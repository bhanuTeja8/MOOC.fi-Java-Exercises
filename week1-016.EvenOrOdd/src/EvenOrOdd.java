
import java.util.Scanner;
import java.lang.Math;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if (Math.abs(number) %2 == 1){ // Math.abs returns absolute value of input.
            System.out.println("Number " + number + " is odd");
        }
        else {
            System.out.println("Number " + number + " is even");
        }
    }
}