import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = in.nextLine();
        System.out.println("Last character: "+ lastCharacter(name));
    }
    public static char lastCharacter(String text){
        return text.charAt(text.length()-1);
    }
}