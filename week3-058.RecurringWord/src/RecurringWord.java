
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> words = new ArrayList<String>();

        while (true){
            System.out.println("Enter a word: ");
            String word = input.nextLine();
            if (words.contains(word)){
                System.out.println("You gave the word "+ word + " twice");
                break;
            }
            else {
                words.add(word);
            }


        }
        
    }
}