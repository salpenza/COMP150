import java.text.DecimalFormat;
public class Weather {
    public static void main(String[] args) {
        int[] weather = { 74, 78, 81, 82, 76, 75, 74 };
        double sum = 0.0;
        double average = 0.0;
        int next = 0;
        int difference = 0;

        System.out.println("Weather for the week:");
        
        for(int i = 0; i < weather.length; i++){
            System.out.print(weather[i] + " ");
            sum += weather[i];
        }

        DecimalFormat df = new DecimalFormat("0.00");
        average = sum / weather.length;
        System.out.println("\nAverage temperature:\n" + df.format(average));

        for(int i = 1; i < weather.length; i++){
            difference = Math.abs(weather[i] - weather[i - 1]);
            if(difference > next){
                next = difference;
            }   
            
        }
        System.out.println("Largest difference between days:\n" + next);
    
    }
}