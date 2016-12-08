package school.lemon.changerequest.java;

//class
class FractionNumber {

    private int d1;  //dividend
    private int d2;  //divisor

    //no arguments constructor
    public FractionNumber(){

    }
    //constructor d1 and d2
    public FractionNumber(int d1, int d2) {
        if(d2 == 0) throw new IllegalArgumentException("Divisor is zero");
        this.d1 = d1;
        this.d2 = d2;
    }

    // divisor = 1
    public FractionNumber(int d1) {
        this(d1,1);
    }

    //tostring
    public String toString (){
        return d1 + "/" + d2;
    }

    // normalized
    private static int normalized (int d1, int d2) {
        if(d2 == 0){
            return d1; }
        return normalized(d2, d1%d2);
    }

    public static int gcm(int d1, int d2){
        if(d2 == 0){ return d1;}
        return gcm(d2, d1%d2); }


    public static String toNormalize(int d1, int d2) {
        int gcm = gcm(d1, d2);
        return (d1 / gcm) + "/" + (d2 / gcm);
    }
    //get d1
    public int getDividend() {
        return this.d1;
    }
    //get d2
    public int getDivisor() {
        return this.d2;
    }


    //decimal value
    public double decimalValue() {
        return ((double) d1)/((double) d2);
    }


    public String addFraction(FractionNumber otherFraction) {
        // a/b + c/d = (ad + cb)/bd
        int a = this.d1;
        int b = this.d2;
        int c = otherFraction.d1;
        int d = otherFraction.d2;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subFraction(FractionNumber otherFraction) {
        // a/b - c/d = (ad - cb)/bd
        int a = this.d1;
        int b = this.d2;
        int c = otherFraction.d1;
        int d = otherFraction.d2;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String mulFraction(FractionNumber otherFraction) {
        // a/b * c/d = ac/bd
        int a = this.d1;
        int b = this.d2;
        int c = otherFraction.d1;
        int d = otherFraction.d2;
        return (a*c) + "/" + (b*d);
    }

    public String divFraction(FractionNumber otherFraction) {
        // (a/b) / (c/d) = ad/bc
        int a = this.d1;
        int b = this.d2;
        int c = otherFraction.d1;
        int d = otherFraction.d2;
        return (a*d) + "/" + (b*c);
    }

    public static final FractionNumber zero = new FractionNumber (0);
    public static final FractionNumber one = new FractionNumber(1);



    public static void main(String[] args) {
        FractionNumber fr1 = new FractionNumber(2, 4);
        FractionNumber fr2 = new FractionNumber(4,7);
        System.out.println("Normalized: " + toNormalize(fr1.d1, fr1.d2));
        System.out.println("To string: " + fr1.toString());
        System.out.println("Get divident: " + fr1.getDividend());
        System.out.println("Get divisor :" + fr2.getDivisor());
        System.out.println("Decimal value: " + fr2.decimalValue());
        System.out.println("Add: " + fr1.addFraction(fr2));
        System.out.println("Sub: " + fr1.subFraction(fr2));
        System.out.println("Mul: " + fr1.mulFraction(fr2));
        System.out.println("Div: " + fr1.divFraction(fr2));

    }
}
