import java.util.Random;
public class CountingTheDays {
    public static void main(String[] args) {
        final int TRIALS = 1000;  
        int temp = 0;
        Random rand = new Random(12345);
        int [] a = new int[TRIALS];
        int [] count = new int[TRIALS];
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(100 - 70 + 1) + 70;
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < a.length; i++){
            temp = a[i];
            count[temp]++;
        }
        for(int i = 70; i <= 100; i++){
            String outcome = (a[i] >= 2 ? " times." : " time." );
            System.out.println(i + " occurred " + count[i] + outcome);
            
        }
    }
}