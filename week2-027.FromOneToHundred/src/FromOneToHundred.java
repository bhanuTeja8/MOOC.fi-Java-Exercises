import java.util.Scanner;

public class FromOneToHundred {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num = 1;
        
        while (num <= 100) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
