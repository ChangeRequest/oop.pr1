package school.lemon.changerequest.java;

/**
 * Created by lera on 14.12.16.
 */
public class FractionNumber {
    private int dividend;
    private int divizor;

    public FractionNumber(int dividend, int divizor) {
        if (divizor == 0) throw new IllegalArgumentException("divisor must not be zero");
        if (dividend == 0) {
            this.dividend = dividend;
            this.divizor = 1;
        } else {
            this.dividend = dividend;
            this.divizor = divizor;
            int nod = nod(this.dividend, this.divizor);
            this.dividend = dividend / nod;
            this.divizor = divizor / nod;
        }

    }

    public int nod(int dividend, int divizor) {
        int maxValue;
        int minValue;
        int nod;
        if (dividend > divizor) {
            maxValue = dividend;
            minValue = divizor;
        } else {
            maxValue = divizor;
            minValue = dividend;
        }
        for (nod = maxValue; nod >= minValue; nod--) {
            if (dividend % nod == 0 & divizor % nod == 0)
                return nod;
        }
        return 1;
    }

    public FractionNumber(int dividend) {
        this.dividend = dividend;
        this.divizor = 1;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivizor() {
        return divizor;
    }

    public double getDecimalValueFractionNumber() {
        return (double) dividend / (double) divizor;
    }

    public FractionNumber addFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        if (divizor == fractionNumber.divizor) {
            newDividend = dividend + fractionNumber.dividend;
            newDivisor = divizor;
        } else {
            newDivisor = divizor * fractionNumber.divizor;
            newDividend = dividend * fractionNumber.divizor + divizor * fractionNumber.dividend;
        }
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber subtractFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        if (divizor == fractionNumber.divizor) {
            newDividend = dividend - fractionNumber.dividend;
            newDivisor = divizor;
        } else {
            newDivisor = divizor * fractionNumber.divizor;
            newDividend = dividend * fractionNumber.divizor - divizor * fractionNumber.dividend;
        }
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber multiplyFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        newDivisor = divizor * fractionNumber.divizor;
        newDividend = dividend * fractionNumber.dividend;
        return new FractionNumber(newDividend, newDivisor);
    }

    public FractionNumber divideFractionNumber(FractionNumber fractionNumber) {
        int newDividend;
        int newDivisor;
        newDividend = dividend * fractionNumber.divizor;
        newDivisor = divizor * fractionNumber.dividend;
        return new FractionNumber(newDividend, newDivisor);
    }

    public static final FractionNumber ONE = new FractionNumber(1, 1);
    public static final FractionNumber ZERO = new FractionNumber(0, 1);

    @Override
    public String toString() {
        return String.format("%1$d/%2$d", dividend, divizor);
    }
}
