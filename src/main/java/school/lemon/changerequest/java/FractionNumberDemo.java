package school.lemon.changerequest.java;

/**
 * Created by lera on 14.12.16.
 */
public class FractionNumberDemo {
    public static void main(String[] args) {
        FractionNumber fractionNumber1 = new FractionNumber(3, 9);
        FractionNumber fractionNumber2 = new FractionNumber(1, 6);
        //    FractionNumber fractionNumber3 = new FractionNumber(1,0);

        System.out.println("FractionNumber1 = " + fractionNumber1);
        System.out.println("FractionNumber2 = " + fractionNumber2);
        System.out.println("FractionNumber2 dividend = " + fractionNumber2.getDividend());
        System.out.println("FractionNumber2 divizor = " + fractionNumber2.getDivisor());
        System.out.println("DecimalValueFractionNumber " + String.format("%.2f", fractionNumber1.getDecimalValueFractionNumber()));
        System.out.println("Add FractionNumber = " + fractionNumber1.addFractionNumber(fractionNumber2));
        System.out.println("Subtract FractionNumber = " + fractionNumber1.subtractFractionNumber(fractionNumber2));
        System.out.println("Multiply FractionNumber = " + fractionNumber1.multiplyFractionNumber(fractionNumber2));
        System.out.println("Divide FractionNumber = " + fractionNumber1.divideFractionNumber(fractionNumber2));
        System.out.println("Fraction number with specifying only dividend " + new FractionNumber(8));
        System.out.println("Predefined objects ONE = " + FractionNumber.ONE);
        System.out.println("Predefined objects ZERO = " + FractionNumber.ZERO);
        //    System.out.println(fractionNumber3.toString());
    }
}
