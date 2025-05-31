
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Length of the first part: ");
        int lengthOfTheFirstPart= input.nextInt();
        
        System.out.println("Result: "+ word.substring(0,lengthOfTheFirstPart));
    }
}