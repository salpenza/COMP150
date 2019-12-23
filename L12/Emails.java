import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Emails{
    public static void main(String[] args) {
        String input;
        String address;
        Scanner scan = new Scanner(System.in);
        ArrayList<String> email = new ArrayList<String>();
        System.out.println("Enter valid educational email addresses, when finished enter 'done': ");
        while(true){          
            input = scan.nextLine();
            if(input.equals("done")){
                break;
            }else if(input.length() <= 3){
                System.out.println("Invalid input, try again.");
            }else if(input.contains("@")){
                address = input.substring(input.length() - 3);
                if(address.equals("edu")){
                    email.add(input);
                }else{
                    System.out.println(input + " is not a valid edu email address.");
                }
            }
        }
        try{
            FileWriter fw = new FileWriter("emails.txt", false); 
            for(String line: email) {
                fw.write(line + ",");
            }
            fw.close();
        
        } catch (IOException ioe){
            System.out.println("problem");
        }
    }
}