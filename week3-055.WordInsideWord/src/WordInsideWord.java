
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Type the 1st word:");
        String word1 = input.nextLine();
        
        System.out.print("Type the 2nd word:");
        String word2 = input.nextLine();

        if (word1.indexOf(word2) != -1) {
            System.out.println("The word '" + word2 + "' is found in the word '" + word1 + "'");
        } else {
            System.out.println("The word '" + word2 + "' is not found in the word '" + word1 + "'");
        }

    }
}