import java.util.Scanner;

public class ShortestWord{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String firstWord = s.next();
        System.out.print("Enter the second word: ");
        String secondWord = s.next();

        int shortest = Math.min(firstWord.length(), secondWord.length());
        System.out.println("The shortest length is: " + shortest);
    }
}