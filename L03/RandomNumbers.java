//Sal, Daniel
import java.util.Random;

public class RandomNumbers {
    
    public static void main(String[] args) {

        Random r = new Random();

        int num1 = r.nextInt(99) + 1;
        int num2 = r.nextInt(99) + 1;

        System.out.println(num1 + " and " + num2);
        System.out.println(Math.abs(num1 - num2));
    }
}