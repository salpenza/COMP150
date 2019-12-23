import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class EchoFile {
    public static void main(String[] args) throws IOException {
        
        int i = 0;
        File input = new File("EchoFileNumbers.txt");
        Scanner file = new Scanner(input);

        do{           
            i++;
            int num = file.nextInt();
            System.out.println(num);
    
        } while(file.hasNext());

        System.out.println("\n" + i + " numbers were present in the file.");
      
    }
}