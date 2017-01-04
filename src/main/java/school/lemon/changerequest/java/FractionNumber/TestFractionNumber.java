package school.lemon.changerequest.java.FractionNumber;

/**
 * Created by heroy on 04.01.2017.
 */
public class TestFractionNumber {
    public static void main(String[] args) {
        FractionNumberOperations operation = new FractionNumberOperations();
        FractionNumber number1 = new FractionNumber(1, 4);
        FractionNumber number2 = new FractionNumber(5, 1);
        System.out.println("GetNumber 1 = " + number1);
        System.out.println("GetNumber 2 = " + number2);
        System.out.println("Separately - " + number1.getDividend() + " and " + number1.getDivisor());
        System.out.println("To string - " + number1.toString());
        System.out.println("Object ONE and ZERO - " + FractionNumber.ONE + " " + FractionNumber.ZERO);
        System.out.println("With only dividend - " + new FractionNumber(5));
        System.out.println("Decimal Value = " + number1.decimalValue());
        System.out.println("Num1*Num2= " + operation.mul(number1, number2));
        System.out.println("Num1/Num2= " + operation.div(number1, number2));
        System.out.println("Num1+Num2= " + operation.add(number1, number2));
        System.out.println("Num1-Num2= " + operation.sub(number1, number2));
    }
}
