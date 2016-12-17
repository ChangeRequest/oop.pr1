package school.lemon.changerequest.java;


/**
 * Created by lera on 15.12.16.
 */
public class Accountant extends Employee {

    Employee[] employees;

    public Accountant(Employee[] employees) {
        super();
        this.employees = employees;
    }

    public Accountant(String name) {
        super(name);
    }

    public double calcSalary(Employee[] emp) {
        double count = 0.;
        for (Employee e : emp) {
            count += e.calculateSalary();
        }
        return count;
    }

    @Override
    public double calculateSalary() {
        return (super.calculateSalary() > super.getSalary()) ? super.getSalary() : super.calculateSalary();
    }

}