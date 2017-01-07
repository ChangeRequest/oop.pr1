package school.lemon.changerequest.java.employees;

/**
 * Created by Yaroslav Pavlinskiy on 06.01.2017.
 */
public class Accountant extends Employee {
    Accountant(String name) {
        super(name);
    }

    public double calculateSalaryForEmployee(Employee e) {
        if(e instanceof Programmer || e instanceof Manager || e instanceof Accountant)
        {
            return e.calculateSalary();
        }
        return 0;
    }
}
