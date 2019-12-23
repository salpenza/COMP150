import java.util.Scanner;
public class WebAddress {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a web address: ");
        String address = s.next();
        String ext = address.substring(address.length() - 3);

        final String gov = "gov";
        final String edu = "edu";
        final String com = "com";
        final String org = "org";

        switch (ext) {
            case gov:
                System.out.println("This is a government web address.");
                break;
            case edu:
                System.out.println("This is a university web address.");
                break;
            case com:
                System.out.println("This is a business web address.");
                break;
            case org:
                System.out.println("This is a organization web address.");
                break;
            default:
                System.out.println("This is a web address for another entity.");
                break;
            
        }
    }
}