import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();


        while (true){
            System.out.println("Type a word");
            String text = input.nextLine();
            if (text.isEmpty()){
               break;
            }else
            {
                words.add(text);
            }
        }
        System.out.println("You Entered the following words");
        Collections.reverse(words);
        for (String word: words) {
            System.out.println(word);
        }
    }
}