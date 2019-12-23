import java.util.Scanner;
public class MaxGradeEnhanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int grade = 1;
        boolean b;
        System.out.println("Enter integers between 0 and 100, -1 when finished.");
        while (grade != -1) {

            System.out.print("Enter a test score: ");
            String s = scan.nextLine();
            b = false;
            
            for(int i = 0; i < s.length(); i++){
                if(!(s.charAt(i) >= '-' && s.charAt(i) <= '9')){
                    b = true;
                }
            }
            if(b){
                System.out.println("Invalid input.");
            }
            else {
                grade = Integer.parseInt(s);
            }
            if(grade > max){
                max = grade;
            }
        }
        System.out.println("The max grade is: " + max);
    }
}