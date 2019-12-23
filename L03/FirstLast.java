import java.util.Scanner;

public class FirstLast{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter full name: ");

        String fullname = s.nextLine();
        int space = fullname.indexOf(' ');
        
        String firstname = fullname.substring(0, space);
        String lastname = fullname.substring(space + 1);

        System.out.println("First name: " + firstname);
        System.out.println("Last name: " + lastname);
        
    }
}