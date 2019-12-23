import java.util.Random;
public class SmallestRandomNumber{
    public static void main(String[] args) {
        
        Random rand = new Random(1234567890);
        int num1 = rand.nextInt(97 - 42 + 1) + 42;
        int num2 = rand.nextInt(97 - 42 + 1) + 42;

        System.out.println("The first random number is: " + num1);
        System.out.println("The second random number is: " + num2);
        System.out.println("The smallest number is: " + Math.min(num1, num2));
    }
}