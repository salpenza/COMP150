import java.util.Scanner;
public class ForFactorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        
        for(int i = 1; i <= num; i++){
           factorial *= i;
        }
        System.out.println(factorial);

    }
}