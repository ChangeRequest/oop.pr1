package school.lemon.changerequest.java.Employees;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        if (getRatioOfHours() >= 1.) {
            return getSalary();
        }
        return getRatioOfHours() * getSalary();
    }
}
