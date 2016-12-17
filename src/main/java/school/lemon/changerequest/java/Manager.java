package school.lemon.changerequest.java;

/**
 * Created by lera on 15.12.16.
 */
public class Manager extends Employee {

    public Manager(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return (super.calculateSalary() > super.getSalary()) ? super.getSalary() : super.calculateSalary();
    }
}
