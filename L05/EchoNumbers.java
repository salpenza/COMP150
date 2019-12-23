import java.util.Scanner;
public class EchoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer, or 0 to stop: ");
        int num = scan.nextInt();
        System.out.println(num);

        while(num != 0){
            
            System.out.print("Enter an integer, or 0 to stop: ");
            num = scan.nextInt();

            if(num == 0){
                break;

            }else{
                
                System.out.println(num);
            }
        }
        System.out.println("Finished!");
    }
}