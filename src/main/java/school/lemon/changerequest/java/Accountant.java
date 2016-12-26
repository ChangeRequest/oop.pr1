package school.lemon.changerequest.java;


/**
 * Created by lera on 15.12.16.
 */
public class Accountant extends Employee {

    public Accountant(String name) {
        super(name);
    }

    public double calcSalary(Employee[] employees) {   //calculate overall salary for all accountable employees (including himself)
        double count = 0.;
        for (Employee e : employees) {
            count += e.calculateSalary();
        }
        return count;
    }
}