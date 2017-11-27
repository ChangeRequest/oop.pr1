package school.lemon.changerequest.java.employees;

abstract public class Employee {

    private static final int WORKING_HOURS_PER_MONTH = 160;

    protected double monthlySalary;
    protected int workedHours;

    public Employee(double monthlySalary, int workedHours) {
        if (monthlySalary < 0 || workedHours < 0)
            throw new IllegalArgumentException("Monthly salary or worked hours are negative");
        this.monthlySalary = monthlySalary;
        this.workedHours = workedHours;
    }

    public Employee(double monthlySalary) {
        this(monthlySalary, 0);
    }

    public Employee() {
        this(0, 0);
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0)
            throw new IllegalArgumentException("Monthly salary is negative");
        this.monthlySalary = monthlySalary;
    }

    public void work(int hours) {
        if (hours < 0)
            throw new IllegalArgumentException("Hours are negative");
        this.workedHours += hours;
    }


    public double getRatioOfWorkedHours() {
        double ratio = (double) workedHours / WORKING_HOURS_PER_MONTH;
        return ratio;
    }

    public double getEarnedSalary() {
        double result = monthlySalary * Math.min(getRatioOfWorkedHours(), 1);
        return result;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    abstract public String toString();

}
