import java.util.Scanner;
public class ValidIdentifiers {
    public static void main(String[] args) {
         
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String input = s.next();
        char c = input.charAt(0);

        if (Character.isLowerCase(c)){
            System.out.println("Valid starting character!");
        }else{
            System.out.println("Invalid starting character ):");
        }

    }
}