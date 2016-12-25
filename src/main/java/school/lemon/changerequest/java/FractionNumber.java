package school.lemon.changerequest.java;

/**
 * Created by lera on 14.12.16.
 */
public class FractionNumber {
    private int dividend;
    private int divisor;

    public FractionNumber(int dividend, int divisor) {
        if (divisor == 0) throw new IllegalArgumentException("divisor must not be zero");
        if (dividend == 0) {
            this.dividend = dividend;
            this.divisor = 1;
        } else {
            this.dividend = dividend;
            this.divisor = divisor;
            int nod = nod(this.dividend, this.divisor);
            this.dividend = dividend / nod;
            this.divisor = divisor / nod;
        }

    }

    public int nod(int dividend, int divisor) {
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
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public double getDecimalValueFractionNumber() {
        return (double) dividend / (double) divisor;
    }

    public FractionNumber addFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        if (divisor == fractionNumber.divisor) {
            newDividend = dividend + fractionNumber.dividend;
            newDivisor = divisor;
        } else {
            newDivisor = divisor * fractionNumber.divisor;
            newDividend = dividend * fractionNumber.divisor + divisor * fractionNumber.dividend;
        }
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber subtractFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        if (divisor == fractionNumber.divisor) {
            newDividend = dividend - fractionNumber.dividend;
            newDivisor = divisor;
        } else {
            newDivisor = divisor * fractionNumber.divisor;
            newDividend = dividend * fractionNumber.divisor - divisor * fractionNumber.dividend;
        }
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber multiplyFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        newDivisor = divisor * fractionNumber.divisor;
        newDividend = dividend * fractionNumber.dividend;
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber divideFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        newDividend = dividend * fractionNumber.divisor;
        newDivisor = divisor * fractionNumber.dividend;
        return new FractionNumber(newDividend, newDivisor);
    }

    public static final FractionNumber ONE = new FractionNumber(1);
    public static final FractionNumber ZERO = new FractionNumber(0);

    @Override
    public String toString() {
        return String.format("%1$d/%2$d", dividend, divisor);
    }
}
