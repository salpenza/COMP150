import java.util.Scanner;
public class MaxGrade {
    public static void main(String[] args) {
        int max = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter test scores, when are you finished, enter a -1.");
        System.out.print("Enter the first test score: ");
        int grade = scan.nextInt();
        max = grade;
        while(grade != -1){
            System.out.print("Enter the next test score: ");
            grade = scan.nextInt();
            if(grade > max){
                max = grade;
            }
        }
        System.out.println("The max score was " + max + ".");
    }
}