import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read from user in this variable

        // First number
        System.out.println("Type the first number:");
        read = Integer.valueOf(reader.nextLine());
        sum = sum + read;

        // Second number
        System.out.println("Type the second number:");
        read = Integer.valueOf(reader.nextLine());
        sum = sum + read;

        // Third number
        System.out.println("Type the third number:");
        read = Integer.valueOf(reader.nextLine());
        sum = sum + read;

        System.out.println("Sum: " + sum);
    }
}
