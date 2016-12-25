package school.lemon.changerequest.java;

/**
 * Created by lera on 15.12.16.
 */
public class Employee {
    private String name;
    private double salary;
    private int workedHours;
    public static final int HOURS_IN_MONTH = 160;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public void setWorkedHours(int workedHours) {
        this.workedHours = workedHours;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }


    public double getRatioOfWorkedHours() {
        double ratioHours = (double) workedHours / HOURS_IN_MONTH;
        return ratioHours;
    }

    public double calculateSalary() {
        double currentSalary = getSalary() * getRatioOfWorkedHours();
        return (currentSalary > getSalary()) ? getSalary() : currentSalary;
    }

    @Override
    public String toString() {
        return "Current month salary " + getName() + " " + calculateSalary();
    }
}
