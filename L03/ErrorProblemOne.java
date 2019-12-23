/*
ErrorProblemOne.java:3: error: cannot find symbol
        Random rand = new Random();
        ^
  symbol:   class Random
  location: class ErrorProblemOne
ErrorProblemOne.java:3: error: cannot find symbol
        Random rand = new Random();
                          ^
  symbol:   class Random
  location: class ErrorProblemOne
2 errors

Fixed by by importing Random class
*/
import java.util.Random;

public class ErrorProblemOne {
    public static void main(String[] args) {
        Random rand = new Random();
    }
}