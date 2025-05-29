import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int number_1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        int number_2 = Integer.parseInt(reader.nextLine());
        
        if (number_1 > number_2){
            System.out.println("Greater number: " + number_1);
        }
        else if (number_2 > number_1){
            System.out.println("Greater number: " + number_2);
        }
        else {
            System.out.println("The numbers are equal!");
        }

    }
}