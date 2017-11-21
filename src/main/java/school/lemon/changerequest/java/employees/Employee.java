package school.lemon.changerequest.java.employees;

abstract public class Employee {

    private static final int HOURS_PER_MONTH = 160;

    protected double salary;
    protected int hours;

    public Employee(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public Employee(double salary) {
        this(salary, 0);
    }

    public Employee() {
        this(0, 0);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void addWorkHours(int hours) {
        this.hours += hours;
    }

    public double getRatio() {
        double ratio = (double) hours / HOURS_PER_MONTH;
        return ratio;
    }

    public double getCurrentSalary() {
        double result = salary * Math.min(getRatio(), 1);
        return result;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    abstract public String toString();

}
