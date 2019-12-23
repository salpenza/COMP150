/*
ErrorProblemTwo.java:3: error: cannot find symbol
        double d = Math.PI();
                       ^
  symbol:   method PI()
  location: class Math
1 error

Deleted the parentheses next to PI
*/
public class ErrorProblemTwo {
    public static void main(String[] args) {
        double d = Math.PI;
        System.out.println("d = " + d);
    }
}