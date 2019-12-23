import java.util.Scanner;
public class Login {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        final String username = "admin";
        final String password = "securePassword";

        System.out.print("Username: ");
        String input1 = s.next();

        System.out.print("Password: ");
        String input2 = s.next();

        if (input1.equals(username) && input2.equals(password)){

            System.out.println("Welcome!");

        }else if (! input1.equals(username) && input2.equals(password)) {

            System.out.println("Wrong username.");

        }else if (input1.equals(username) && ! input2.equals(password)){

            System.out.println("Wrong password.");

        }else{

            System.out.println("Wrong username and password.");
            
        }


    }
}