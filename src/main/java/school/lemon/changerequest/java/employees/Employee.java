package school.lemon.changerequest.java.employees;

/**
 * Created by Yaroslav Pavlinskiy on 06.01.2017.
 */
public abstract class Employee {
    public final int HOURS_PER_MONTH = 160;
    private String name;
    private double salary;
    private int hours;

    Employee(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHours() {
        return hours;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void working(int hours)
    {
        this.hours += hours;
    }

    public double calculateSalary()
    {
        if(this.hours >= HOURS_PER_MONTH)
            return salary;
        return salary/(HOURS_PER_MONTH/hours);
    }

    @Override
    public String toString() {
        return String.format("%s with salary %s $ worked %s hours -> salary %s $",getName(),getSalary(),getHours(),calculateSalary());
    }


}
