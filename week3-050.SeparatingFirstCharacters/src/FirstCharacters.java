import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        String name = in.nextLine();
        
        if (name.length()<3){

        }else{
            System.out.println("1. character: "+ name.charAt(0));
            System.out.println("2. character: "+ name.charAt(1));
            System.out.println("3. character: "+ name.charAt(2));
        }


    }
}