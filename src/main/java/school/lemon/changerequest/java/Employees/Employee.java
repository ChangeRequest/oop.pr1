package school.lemon.changerequest.java.Employees;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class Employee {
    private String name;
    private int salary;
    private int hours;
    public static final int DEFAULT_HOURS = 160;
    public static final int DEFAULT_SALARY = 100;


    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRatioOfHours() {
        return (double) getHours() / DEFAULT_HOURS;
    }

    public double calculateSalary() {
        return getRatioOfHours() * getSalary();
    }

    @Override
    public String toString() {
        return "Current month salary of " + getName() + " is " + calculateSalary();
    }
}
