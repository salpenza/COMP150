public class Average {
    public static void main(String[] args) {
        double sum = 0.0;
        int[] data = { 100, 92, 42, 77, 87, 89, 93, 94, 55, 99 };
        for(int i = 0; i < data.length; i++){
            sum += data[i];
        }
        System.out.println("The average is: " + (sum / data.length));
    }
}