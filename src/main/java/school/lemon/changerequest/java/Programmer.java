package school.lemon.changerequest.java;

/**
 * Created by lera on 15.12.16.
 */
public class Programmer extends Employee {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        double currentSalary = getSalary() * getRatioOfWorkedHours();
        return currentSalary;
    }
}

