public class RationalNumberClient {
    public static void main(String [] args) {
        
        RationalNumber rn1 = new RationalNumber(3,4); // 3/4
        RationalNumber rn2 = new RationalNumber(5,6); // 5/6

        RationalNumber res = rn1.multiply(rn2);
        System.out.println(res); // should print 15/24

        RationalNumber rn3 = new RationalNumber();
        rn3.setNumerator(3);
        rn3.setDenominator(0); // changes to 1

        System.out.println(rn3.toString());
        System.out.println(rn3.getNumerator());
        System.out.println(rn3.getDenominator());

        if(! (rn3.equals(rn1))) {
            System.out.println("They're different."); // should print
        }
        if(rn1.equals(rn2)){
            System.out.println("They're equal."); // shouldn't print
        }
    }
}