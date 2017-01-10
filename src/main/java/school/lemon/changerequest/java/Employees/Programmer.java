package school.lemon.changerequest.java.Employees;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class Programmer extends Employee {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return getRatioOfHours() * getSalary();
    }
}
