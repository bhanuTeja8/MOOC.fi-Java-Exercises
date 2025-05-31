import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word: ");
        String word = input.nextLine();
        
        System.out.println("Enter the length of the end part: ");
        int lengthOfTheEndPart = input.nextInt();
        
        System.out.println("Result :" + word.substring(word.length()-lengthOfTheEndPart));
    }
}