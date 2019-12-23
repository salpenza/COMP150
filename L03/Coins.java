import java.util.Scanner;
import java.text.NumberFormat;

public class Coins{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Quarters: ");
        int quarters = s.nextInt();

        System.out.print("Dimes: ");
        int dimes = s.nextInt();

        System.out.print("Nickels: ");
        int nickels = s.nextInt();

        double total = (quarters * (0.25)) + (dimes * (0.10)) + (nickels * (0.05));

        NumberFormat priceFormat = NumberFormat.getCurrencyInstance( );
        
        System.out.println("You have " + priceFormat.format(total));

    }
}