
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Numerator: ");
        String numInput = reader.nextLine();
        int numerator = Integer.valueOf(numInput);

        System.out.print("Denominator: ");
        String denomInput = reader.nextLine();
        int denominator = Integer.valueOf(denomInput);

        double result = (double) numerator / denominator;

        System.out.println("Division: " + numerator + " / " + denominator + " = " + result);
    }
}
