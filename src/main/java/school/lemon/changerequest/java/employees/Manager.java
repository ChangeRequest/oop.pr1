package school.lemon.changerequest.java.employees;

public class Manager extends Employee {

    public Manager() {
        super();
    }

    public Manager(double salary, int hours) {
        super(salary, hours);
    }

    public Manager(double salary) {
        super(salary);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Manager. Salary = ").append(salary).append(". Hours = " + hours).
                append(". Ratio = ").append(getRatio()).append(". Current salary = ").append(getCurrentSalary());
        ;
        return result.toString();
    }
}
