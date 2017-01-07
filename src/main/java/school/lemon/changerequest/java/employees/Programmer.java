package school.lemon.changerequest.java.employees;

/**
 * Created by Yaroslav Pavlinskiy on 06.01.2017.
 */
public class Programmer extends Employee {
    Programmer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return (double)getHours()/((double)HOURS_PER_MONTH / getSalary());
    }
}
