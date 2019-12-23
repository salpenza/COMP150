public class Floats {
    public static void main(String[] args) {

        final double THRESHOLD = .0001;

        double d1 = .0; // add .1 to 0 eleven times
        d1 += .1;  // 1
        d1 += .1;  // 2
        d1 += .1;  // 3
        d1 += .1;  // 4
        d1 += .1;  // 5
        d1 += .1;  // 6
        d1 += .1;  // 7
        d1 += .1;  // 8
        d1 += .1;  // 9
        d1 += .1;  // 10
        d1 += .1;  // 11

        double d2 = .1 * 11;

        if ( Math.abs( d1 - d2 ) < THRESHOLD ) {

            System.out.println(d1 + " is equal to " + d2);

        } else {
            
            System.out.println("Not equal");
        }
    
    }
}