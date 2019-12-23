import java.util.Random;

public class CountingTheGrades {
    public static void main(String[] args) {
        int temp = 0;
        int j = 70;
        final int NUM_OF_STUDENTS = 30;
        int[] grades = new int[NUM_OF_STUDENTS];
        int[] count = new int[100];
        Random rand = new Random(12345);

        for(int i = 0; i < grades.length; i++){
            grades[i] = rand.nextInt(100 - 70 + 1) + 70;
            System.out.print(grades[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < grades.length; i++){
            temp = grades[i];
            count[temp - 70]++;
        }
        for(int i = 0; i <= 30; i++){
            System.out.println(j + " appeared " + count[i] + " times.");
            j++;
        }
    }
}