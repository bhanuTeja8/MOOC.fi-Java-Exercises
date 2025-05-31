import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String name = in.nextLine();
        
        System.out.println("First character : "+ firstCharacter(name));

    }
    public static char firstCharacter (String text){
        return text.charAt(0);
    }
}