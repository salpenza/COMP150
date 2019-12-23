/*
ErrorProblemThree.java:5: error: ';' expected
        int x = 5
                 ^
ErrorProblemThree.java:6: error: unclosed string literal
        System.out.println("x is  + x);
                           ^
2 errors

ErrorProblemThree.java:14: error: variable s might not have been initialized
        System.out.println("s length = " + s.length());
                                           ^
1 error

Added  '= new String();' to String s;
Added semicolon in 'x=5'
Added quotation mark in the 'x is + x' line
*/

public class ErrorProblemThree {
    public static void main(String [] args) {
        String s = new String();
        System.out.println("s length = " + s.length());
        int x = 5;
        System.out.println("x is "  + x);
    }
}