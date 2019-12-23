import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        final int NUM_OF_STUDENTS = 30;
        int[] grades = new int[NUM_OF_STUDENTS];
        Random rand = new Random(12345);
        Scanner scan = new Scanner( System.in );

        for(int i = 0; i < grades.length; i++){
            grades[i] = rand.nextInt(100 - 70 + 1) + 70;
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
        
        System.out.print("Enter a value between 70 - 100: ");
        int key = scan.nextInt();
        int index = binarySearch(grades, key);
        if(index != -1){
            System.out.println( key + " found at index " + index );
        }else{
            System.out.println( key + " not found" );
        }
    } 
        public static int binarySearch(int [] a, int key){

            int start = 0;
            int end = a.length - 1;

            while ( end >= start ){

                int mid = (start + end) / 2;
                if (a[mid] == key) {
                    return mid;
                } else if (a[mid] > key) {
                    end = mid - 1;
                } else if ( a[mid] < key) {
                    start = mid + 1;
                }  
            }
            return -1;
        }      
    
}
