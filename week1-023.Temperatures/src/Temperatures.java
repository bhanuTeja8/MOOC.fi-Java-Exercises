import java.util.Scanner;


public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter numbers (double): ");
            double number = Double.parseDouble(reader.nextLine());
            if (-30 <= number && number <= 40){
                Graph.addNumber(number);
            }
            else if (number < -30){
                System.out.println("Temperature below -30 degrees are ignored");
            }
            else if (number > 40){
                System.out.println("Temperature over 40 degrees are ignored");
            }
        }

    }
}