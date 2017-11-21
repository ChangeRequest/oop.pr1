package school.lemon.changerequest.java.employees;

public class Accountant extends Employee {

    public Accountant() {
        super();
    }

    public Accountant(double salary, int hours) {
        super(salary, hours);
    }

    public Accountant(double salary) {
        super(salary);
    }

    public double calculateAllSalary(Employee[] employees) {
        double result = 0;
        for (Employee worker : employees)
            result += worker.getCurrentSalary();
        result += getCurrentSalary();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Accountant. Salary = ").append(salary).append(". Hours = " + hours).
                append(". Ratio = ").append(getRatio()).append(". Current salary = ").append(getCurrentSalary());
        return result.toString();
    }
}
