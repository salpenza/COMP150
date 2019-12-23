public class AverageMethod {
    public static double Average(int[] a){
        double average = 0.0;
        double  sum = 0.0;
        for(int i = 0; i < a.length; i++){
            sum += a[i];
        }
        average = (sum / a.length);
        return average;
    }
    public static void main(String[] args) {
        int[] data = { 100, 92, 42, 77, 87, 89, 93, 94, 55, 99 };
        System.out.println("The average is: " + Average(data));

    }
}