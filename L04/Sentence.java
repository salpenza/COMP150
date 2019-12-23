import java.util.Scanner;
public class Sentence {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = s.next();
        String input = sentence.substring(sentence.length() - 1);

        final String c1 = ".";
        final String c2 = "?";
        final String c3 = "!";
        
        switch (input){
            case c1:
                System.out.println("Declarative!");
                break;
            case c2:
                System.out.println("Interrogative!");
                break;
            case c3:
                System.out.println("Exclamatory!");
                break;
            default:
                System.out.println("other.");

        }
            

    }
}