package school.lemon.changerequest.java.Employees;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class Accountant extends Employee {
    private static int countAccountant;

    public Accountant(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        if (getRatioOfHours() >= 1.) {
            return getSalary();
        }
        return getRatioOfHours() * getSalary();
    }

    public int overallSalary(Employee[] employees) {
        double i = 0.;
        for (Employee employee : employees) {
            i += employee.calculateSalary();
        }
        return (int) i;
    }
}