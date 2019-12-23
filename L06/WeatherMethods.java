import java.text.DecimalFormat;
public class WeatherMethods {
    public static void main(String[] args) {
        int[] weather = { 74, 78, 81, 82, 76, 75, 74 };
        DecimalFormat df = new DecimalFormat("0.00");
        printWeather(weather);

        float avg = averageWeather(weather);
        System.out.println("\nAverage temperature:\n" + df.format(avg));

        int difference = differenceWeather(weather);
        System.out.println("Largest difference between days:\n" + difference);
    }

    public static void printWeather( int [] weather ) {
      System.out.println("Weather for the week:");
      for(int i = 0; i < weather.length; i++){
         System.out.print(weather[i] + " ");
      }
    }

    public static float averageWeather(int [] weather) {
        float sum = 0.0f;
        float average = 0.0f;
        for(int i = 0; i < weather.length; i++){
            sum += weather[i];
        }
        average = sum / weather.length;
        return average;
    }

    public static int differenceWeather(int [] weather) {
        int difference = 0;
        int next = 0;
        for(int i = 1; i < weather.length; i++){
            difference = Math.abs(weather[i] - weather[i - 1]);
            if(difference > next){
                next = difference;
            }
        }
        return next;
    }   
}