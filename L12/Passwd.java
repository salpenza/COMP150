import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.io.FileNotFoundException;

public class Passwd{
    public static void main(String[] args) {
        File file = new File("passwd.txt");
        try {
            Scanner scan = new Scanner(file);         
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                try{
                    Scanner parser = new Scanner(line);
                    parser.useDelimiter(":");
                    String name = parser.next();
                    int code = parser.nextInt();
                    String job = parser.next();
                    String address = parser.next();
                    System.out.printf("%-12s%-5d%-15s%-10s\n", name, code, job, address);
                } 
                catch(InputMismatchException ime){
                    System.out.println("*** Error, bad data format. " + "( " + line + " )");
                } 
                catch(NoSuchElementException nse){
                    System.out.println("*** Error, not enough data. " + "( " + line + " )");
                    Scanner fixer = new Scanner(line);
                    fixer.useDelimiter(":");
                    String name = fixer.next();
                    int code = fixer.nextInt();
                    String job = "staff";
                    String address = fixer.next();
                    System.out.printf("%-12s%-5d%-15s%-10s\n", name, code, job, address);
                }
            }
        }
        catch (FileNotFoundException fnfe){
            System.out.println("Unable to find passwd.txt, exiting");
        }
    }
}