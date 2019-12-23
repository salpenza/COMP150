import java.util.Scanner;
public class StrangeCalculator {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        final int first = s.nextInt();
        final int second = s.nextInt();
        System.out.print("Enter an operation (*, /, -, or +): ");
        char op = s.next().charAt(0);

        switch (op) {
            case '*':
                System.out.println("The result is: " + (first * second));
                break;
            case '/':
                System.out.println("The result is: " + (first / second));
                break;
            case '-':
                System.out.println("The result is: " + (first - second));
                break;
            case '+':
                System.out.println("The result is: " + (first + second));
                break;
            default:
                System.out.println("Invalid operator entered.");
                System.exit(0);
                break;
        }

        String greater = ( first > second ? "first" : "second" );
        String lesser = (first < second ? "first" : "second" );

        System.out.println("\nInteresting facts about the two numbers: ");

        if (first == second) {
           System.out.println("They are the same number.");
        } else {
           System.out.println("The " + greater + " number is larger than the " + lesser + ".");
        }   
            
        if ((first % 2) == 0 && (second % 2) == 0){
            System.out.println("They are both even numbers.");
        } else if ((first % 2) != 0 && (second % 2) != 0){
            System.out.println("They are both odd numbers.");
        } else {
            System.out.println("They are a mix of odd and even numbers.");
        }

        if (second % first == 0){
            System.out.println("The first number happens to divide the second number.");
        } else if (first % second == 0){
            System.out.println("The second number happens to divide the first number.");
        }
    }   
}