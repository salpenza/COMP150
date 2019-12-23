import java.util.Scanner;
public class AgeVerification {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);       
        String notInt;
        System.out.print("Enter your age as an integer: " );

        while (!scan.hasNextInt()){
            notInt = scan.nextLine( );
            System.out.print( "Please enter an integer: " );
        }

        int age = scan.nextInt( );
        System.out.println( "Your age is " + age );
    }
}