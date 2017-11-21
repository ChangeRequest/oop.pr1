package school.lemon.changerequest.java.employees;

public class Programmer extends Employee {


    public Programmer() {
        super();
    }

    public Programmer(double salary, int hours) {
        super(salary, hours);
    }

    public Programmer(double salary) {
        super(salary);
    }

    public double getCurrentSalary() {
        double result = salary * getRatio();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Programmer. Salary = ").append(salary).append(". Hours = " + hours).
                append(". Ratio = ").append(getRatio()).append(". Current salary = ").append(getCurrentSalary());
        ;
        return result.toString();
    }

}
