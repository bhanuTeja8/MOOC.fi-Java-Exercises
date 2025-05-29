import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        
        while(true){ // While loop used to constantly ask for password from user.
            System.out.print("Type the password: ");
            String checkPassword = reader.nextLine();
            if (checkPassword.equals(password)){
                System.out.println("Right!");
                break; // If input equals to password, break while loop.
            }
            else {
                System.out.println("Wrong!");
            }
        }
        
        System.out.println("The secret is: Eat your veges.");
        
        
    }
}