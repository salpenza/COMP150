public class DotProduct {
    public static void main(String[] args) {
        int dot = 0;
        int [] a = { 2, 4, 6 };
        int [] b = { 7, 2, 9 };
        for(int i = 0; i < a.length; i++){
            dot += a[i] * b[i];
        }
        System.out.println("The dot product is: " + dot);
    }
}