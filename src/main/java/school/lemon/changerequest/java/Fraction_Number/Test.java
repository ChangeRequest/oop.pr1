package school.lemon.changerequest.java.Fraction_Number;

/**
 * Created by User on 07.12.2016.
 */
public class Test {
    public static void main(String[] args) {

        FractionNumber f1=new FractionNumber(3,4);
        FractionNumber f2= new FractionNumber(9,2);
        System.out.println("df");
        FractionNumber f3=new FractionNumber(3,0);
        System.out.println(f3.toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("ТЕСТ на сложение "+f1.add(f2).toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("Тест На умножение "+f1.multiply(f2).toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("Тест На деление "+f1.divide(f2).toString());
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println("Тест На отнимание "+f1.subtract(f2).toString());
        System.out.println("Тест На отнимание "+f2.subtract(f1).toString());




    }


}
