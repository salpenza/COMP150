public class RationalNumber {
    private int numerator;
    private int denominator;

    public RationalNumber(){
        denominator = 1;
    }

    public RationalNumber(int numerator, int denominator){
        this.numerator = numerator;
        if(denominator == 0){
            denominator = 1;
        }
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if(denominator==0) {
            denominator=1;
        }
        this.denominator = denominator;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public boolean equals(Object o) {
        boolean retVal = false;
        if(o instanceof RationalNumber) {
            RationalNumber r = (RationalNumber) o;
            if(numerator == r.getNumerator() && denominator == r.getDenominator()) {
                retVal = true;
            }
        }
        return retVal;
    }

    public RationalNumber multiply(RationalNumber rn){
        int newDenominator = denominator * rn.getDenominator();
        int newNumerator = numerator * rn.getNumerator();
        RationalNumber rational = new RationalNumber(newNumerator,newDenominator);
        return rational;
    }

}