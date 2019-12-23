import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        int temp;
        Random rand = new Random(12345);
        final int NUM_OF_STUDENTS = 30;
        int[] grades = new int[NUM_OF_STUDENTS];

        System.out.println("Grades (unsorted):");
        for(int i = 0; i < grades.length; i++){
            grades[i] = rand.nextInt(100 - 70 + 1) + 70;
            System.out.print(grades[i] + " ");
        } 
            
        for (int i = 0; i < grades.length - 1; i++){ 
            int min = i; 
            for (int j = i + 1; j < grades.length; j++){
                if(grades[j] < grades[min]){
                    min = j; 
                }
            }
            temp = grades[min]; 
            grades[min] = grades[i]; 
            grades[i] = temp; 
        } 
            
       System.out.println("\nGrades (sorted):");
       for(int i = 0; i < grades.length; i++){
            System.out.print(grades[i] + " ");
        } 
    }
}