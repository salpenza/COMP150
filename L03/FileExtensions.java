//Sal, Daniel
import java.util.Scanner;
public class FileExtensions{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String filename = s.next();
        int dot = filename.indexOf('.');
        String ext = filename.substring(dot + 1);
        System.out.println("Extension: " + ext);


    }
}