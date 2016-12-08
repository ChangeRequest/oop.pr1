package school.lemon.changerequest.java.Fraction_Number;

/**
 * Created by User on 07.12.2016.
 */
public class FractionNumber {
    public FractionNumber() {
    }

    public FractionNumber(int Numerator, int Denominator) {
        this.Numerator = Numerator;

        if(Denominator==0){System.out.println("WRONG");}
        else this.Denominator = Denominator;
    }

    public FractionNumber(int NumeratorF) {
        this(NumeratorF, 1);
    }

    public int Get() {
        int m = getNumerator();
        int n = getDenominator();
        int r = 0;
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }

    public void Normalized() {
        int div = Get();
        Numerator = Numerator / div;
        Denominator = Denominator / div;
    }



    public int getNumerator() {
        return Numerator;
    }

    public int getDenominator() {
        return Denominator;
    }

    public double getDecimalValue() {
        return (double) Numerator / (double) Denominator;
    }
    public String toString() {
        return Numerator + "/" + Denominator;
    }


    public FractionNumber add(FractionNumber a) {
        int aN = a.getNumerator();
        int aD = a.getDenominator();
        int An = this.Numerator;
        int Ad = this.Denominator;
        if (this.Denominator == aD) {
            aN = An + aN;
        } else {
            aN = aN * Ad;
            An = An * aD;
            aN = An + aN;
            aD = Ad * aD;
        }
        FractionNumber b = new FractionNumber(aN, aD);
        b.Normalized();
        return b;
    }
    public FractionNumber multiply(FractionNumber a) {
        int aN = a.getNumerator();
        int aD = a.getDenominator();
        aN = aN * this.Numerator;
        aD = aD * this.Denominator;

        FractionNumber b = new FractionNumber(aN, aD);
        b.Normalized();
        return b;
    }
    public FractionNumber divide(FractionNumber a) {
        int aN = a.getNumerator();
        int aD = a.getDenominator();
        int An = this.Numerator;
        int Ad = this.Denominator;

        Ad = Ad * aN;
        An = An * aD;
        FractionNumber b = new FractionNumber(An, Ad);
        b.Normalized();
        return b;
    }

    public FractionNumber subtract(FractionNumber a) {
        int aN = a.getNumerator();
        int aD = a.getDenominator();

        int An = this.Numerator;
        int Ad = this.Denominator;
        if (this.Denominator == aD) {
            aN = An - aN;
        } else {

            aN = aN * Ad;
            An = An * aD;
            aN = An-aN;
            aD = Ad * aD;
        }
        FractionNumber b = new FractionNumber(aN, aD);
        b.Normalized();
        return b;
    }


    final int def = 1;
    protected int Numerator;
    protected int Denominator;

    int a = Numerator;
    int b = Denominator;

}














