package school.lemon.changerequest.java.FractionNumber;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class FractionNumberOperations {
    public FractionNumber add(FractionNumber a, FractionNumber b) {

        if (a.getDivisor() == b.getDivisor()) {
            return new FractionNumber(a.getDividend() + a.getDividend(), a.getDivisor());
        } else {
            int tmp = 1;

            while (tmp <= a.getDivisor() * b.getDivisor()) {
                if (tmp % a.getDivisor() == 0 && tmp % b.getDivisor() == 0) {
                    break;
                }
                tmp++;
            }

            int i = a.getDividend() * (tmp / a.getDivisor());
            int j = b.getDividend() * (tmp / b.getDivisor());

            return new FractionNumber(i + j, tmp);
        }
    }

    public FractionNumber div(FractionNumber a, FractionNumber b) {
        return new FractionNumber(a.getDividend() * b.getDivisor(), b.getDividend() * a.getDivisor());
    }

    public FractionNumber mul(FractionNumber a, FractionNumber b) {
        return new FractionNumber(a.getDividend() * b.getDividend(), a.getDivisor() * b.getDivisor());
    }

    public FractionNumber sub(FractionNumber a, FractionNumber b) {

        if (a.getDivisor() == b.getDivisor()) {
            return new FractionNumber(a.getDividend() - b.getDividend(), a.getDivisor());
        } else {
            int tmp = 1;

            while (tmp <= a.getDivisor() * b.getDivisor()) {
                if (tmp % a.getDivisor() == 0 && tmp % b.getDivisor() == 0) {
                    break;
                }
                tmp++;
            }

            int i = a.getDividend() * (tmp / a.getDivisor());
            int j = b.getDividend() * (tmp / b.getDivisor());

            return new FractionNumber(i - j, tmp);
        }

    }
}

