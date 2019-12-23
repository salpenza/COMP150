import java.text.DecimalFormat;

public class ArrayPlayground {

    public static void printAllElements(int [][] a) {
        // TODO: Print every element in the array
        System.out.println("printAllElements()");

        for(int i = 0; i < a.length; i++){            
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
             }
        }
        System.out.print("\n");
        System.out.println("Done -------------");
    }

    public static void printAllElementsWithCoordinates(int [][] a) {
        // TODO: Print each element as {row, col: value}
        System.out.println("printAllElementsWithCoordinates()");
        for(int i = 0; i < a.length; i++){            
            for(int j = 0; j < a[i].length; j++){
                System.out.println("{"+ i + ", " + j + ": " + a[i][j] + "}");
             }
        }
        System.out.println("Done -------------");
    }

    public static void printAllElementsAsTable(int [][] a) {
        // TODO: Print a NxM array as an NxM table
        System.out.println("printAllElementsAsTable()");
        for(int i = 0; i < a.length; i++){            
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
             }
            System.out.print("\n");
        }
        System.out.println("Done -------------");
    }

    public static void printElementsByRow(int [][] a, int row) {
        // TODO: Print all elements in the array from row row
        System.out.println("printElementsByRow(" + row + ")");
        for(int i = row; i == row; i++){            
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
        }
        System.out.print("\n");
        System.out.println("Done -------------");
        
    }

    public static float averageOfAllElements(int [][] a) {
        // TODO: Return the average value of all the elements
        System.out.println("averageOfAllElements()");
        int count = 0;
        int sum = 0;
        float average = 0.0f;
        // Do not modify the code above this comment and below the TODO comment.
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                sum += a[i][j];
                count++;
            }
        }
        average = (float)sum / count;
        System.out.println("Done -------------");
        return average;
    }

    public static int findMaxInRow(int [][] a, int row) {
        // TODO: Return the max value from row row.
        int max = -1;
        System.out.println("findMaxInRow(" + row + ") called");
        for (int i = 0; i < a[row].length; i++) { 
            if (a[row][i] > max) { 
                max = a[row][i]; 
            } 
        } 
         
        return max;
    }

    public static void printMaxInEachRow(int [][] a) {
        // TODO: Call your findMaxInRow for each row in a, print the value
        System.out.println("printMaxInEachRow()");
        for(int i = 0; i < a.length; i++){
            System.out.println("Row " + i + ": " + findMaxInRow(a, i));
        }
        System.out.println("Done -------------");
    }

    public static void main(String [] args) {
        int [][] arr1 = {{1,2,3,4},{5,6,7},{8,9}};

        ArrayPlayground.printAllElements(arr1);

        ArrayPlayground.printAllElementsWithCoordinates(arr1);

        ArrayPlayground.printAllElementsAsTable(arr1);

        ArrayPlayground.printElementsByRow(arr1, 0);
        ArrayPlayground.printElementsByRow(arr1, 1);

        int [][] arr2 = {{1234,123,73,12134,1234},{498,465,1,684,89,64,86,0,6996,4,61,65,468,84,8684,68,},{1234,1243,5243,898,34,98848,6,68},{1000}};
        float avg = ArrayPlayground.averageOfAllElements(arr2);
        System.out.println("Method Returned: " + avg);

        ArrayPlayground.printMaxInEachRow(arr1);
        ArrayPlayground.printMaxInEachRow(arr2);

    }
}