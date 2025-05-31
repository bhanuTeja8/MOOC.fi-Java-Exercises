
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();
        while (true){
            System.out.println("type a word :");
            String  typedWord = input.nextLine();

            if (typedWord.isEmpty()){
                break;
            }
            else
            {
                words.add(typedWord);
            }

        }
        System.out.println("You have entered the following words: ");
        Collections.sort(words);
        for (String word: words) {
            System.out.println(word);

        }
    }
}