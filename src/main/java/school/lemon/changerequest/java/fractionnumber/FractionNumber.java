package school.lemon.changerequest.java.fractionnumber;

public class FractionNumber {
    private int dividend;
    private int divisor;

    public static FractionNumber ONE = new FractionNumber(1, 1);
    public static FractionNumber ZERO = new FractionNumber(0, 1);

    private void normalize() {
        if (dividend == 0) {
            divisor = 1;
            return;
        }
        int greatestCommonDivisor = greatestCommonDivisor(dividend, divisor);
        dividend /= greatestCommonDivisor;
        divisor /= greatestCommonDivisor;
        if (divisor < 0) {
            dividend *= -1;
            divisor *= -1;
        }
    }

    private int greatestCommonDivisor(int a, int b) {
        while (b != 0) {
            a %= b;
            int tmp = a;
            a = b;
            b = tmp;
        }
        return a;
    }

    public FractionNumber(int dividend, int divisor) {
        if (divisor == 0)
            throw new IllegalArgumentException("Divisor is equal to zero");
        this.divisor = divisor;
        this.dividend = dividend;
        normalize();
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

    public double getDecimal() {
        double result = (double) dividend / divisor;
        return result;
    }

    public FractionNumber add(FractionNumber value) {
        int resultDividend = dividend * value.divisor + divisor * value.dividend;
        int resultDivisor = divisor * value.divisor;
        FractionNumber result = new FractionNumber(resultDividend, resultDivisor);
        return result;
    }

    public FractionNumber subtract(FractionNumber value) {
        int resultDividend = dividend * value.divisor - divisor * value.dividend;
        int resultDivisor = divisor * value.divisor;
        FractionNumber result = new FractionNumber(resultDividend, resultDivisor);
        return result;
    }

    public FractionNumber multiply(FractionNumber value) {
        int resultDividend = dividend * value.dividend;
        int resultDivisor = divisor * value.divisor;
        FractionNumber result = new FractionNumber(resultDividend, resultDivisor);
        return result;
    }

    public FractionNumber divide(FractionNumber value) {
        int resultDividend = dividend * value.divisor;
        int resultDivisor = divisor * value.dividend;
        FractionNumber result = new FractionNumber(resultDividend, resultDivisor);
        return result;
    }

    public String toString() {
        StringBuilder result = new StringBuilder().append(dividend).append('/').append(divisor);
        return result.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (obj == null)
            return false;

        if (!(getClass() == obj.getClass()))
            return false;
        else {
            FractionNumber tmp = (FractionNumber) obj;
            if (divisor == tmp.divisor && dividend == tmp.dividend)
                return true;
            else
                return false;
        }
    }
}
