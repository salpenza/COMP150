import java.util.Scanner;
public class Weather {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int temp = s.nextInt();

        if (temp > 110 || temp < -5) {
            System.out.println("The temperature entered is outside the valid range.");
        } else if (temp >= 90) {
            System.out.println("It is probably summer.");
        } else if (temp >= 70 && temp < 90) {
            System.out.println("It is probably spring.");
        } else if (temp >= 50 && temp < 70) {
            System.out.println("It is probably fall.");
        } else {
            System.out.println("It is probably winter.");
        }
    }
}