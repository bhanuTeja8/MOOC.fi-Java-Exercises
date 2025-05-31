
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type your name :");
        String name = in.nextLine();
        
        int i=0;
        
        while (i< name.length()){
            System.out.println((i+1) + "."+ "character :" + name.charAt(i));
            i++;
        }
    }
}