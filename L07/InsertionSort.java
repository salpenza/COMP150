import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        final int NUM_OF_STUDENTS = 30;
        int[] grades = new int[NUM_OF_STUDENTS];
        Random rand = new Random(12345);

        System.out.println("Grades (unsorted):");
        for(int i = 0; i < grades.length; i++){
            grades[i] = rand.nextInt(100 - 70 + 1) + 70;
            System.out.print(grades[i] + " ");
        } 
        
        for(int i = 1; i < grades.length; ++i){
            int index = grades[i]; 
            int j = i - 1; 
  
            while (j >= 0 && grades[j] > index) { 
                grades[j + 1] = grades[j]; 
                j = j - 1; 
            } 
            grades[j + 1] = index; 
        }  

        System.out.println("\nGrades (sorted):");
        for(int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        } 
    }
}