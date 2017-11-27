package school.lemon.changerequest.java.employees;

public class Manager extends Employee {

    public Manager() {
        super();
    }

    public Manager(double monthlySalary, int workedHours) {
        super(monthlySalary, workedHours);
    }

    public Manager(double monthlySalary) {
        super(monthlySalary);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Manager{");
        sb.append("monthlySalary=").append(monthlySalary);
        sb.append(", workedHours=").append(workedHours);
        sb.append('}');
        return sb.toString();
    }
}
