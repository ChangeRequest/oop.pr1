package school.lemon.changerequest.java.FractionNumber;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class FractionNumber {
    private int dividend;
    private int divisor;
    private static int DEFAULT_DIVISOR = 1;
    public static final FractionNumber ONE = new FractionNumber(1);
    public static final FractionNumber ZERO = new FractionNumber(0);

    public FractionNumber(int dividend, int divisor) {
        if (divisor == 0) throw new IllegalArgumentException("divisor must not be zero");
        if (dividend == 0) {
            this.dividend = dividend;
            this.divisor = DEFAULT_DIVISOR;
        } else {
            this.dividend = dividend;
            this.divisor = divisor;
            int nod = gcd(this.dividend, this.divisor);
            this.dividend = dividend / nod;
            this.divisor = divisor / nod;
        }
    }

    private int gcd(int dividend, int divisor) {
        int maxValue;
        int minValue;
        int nod;
        if (dividend > divisor) {
            maxValue = dividend;
            minValue = divisor;
        } else {
            maxValue = divisor;
            minValue = dividend;
        }
        for (nod = maxValue; nod >= minValue; nod--) {
            if (dividend % nod == 0 & divisor % nod == 0)
                return nod;
        }
        return 1;
    }


    public FractionNumber(int dividend) {
        this.dividend = dividend;
        this.divisor = 1;
    }

    public int getDividend() {
        return this.dividend;
    }

    public int getDivisor() {
        return this.divisor;
    }

    public double decimalValue() {
        return ((double) dividend) / ((double) divisor);
    }

    @Override
    public String toString() {
        return "" + dividend + "/" + divisor;
    }


}
