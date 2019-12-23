import java.util.Scanner;
public class TypeSafeSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int num = 1;
        boolean b;

        while (num != 0) {

            System.out.print("Enter an integer, 0 to stop: ");
            String s = scan.nextLine();
            b = false;
            
            for(int i = 0; i < s.length(); i++){
                if(!(s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                    b = true;
                }
            }
            if(b){
                System.out.println("Invalid input.");
            }
            else {
                num = Integer.parseInt(s);
                sum += num;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}