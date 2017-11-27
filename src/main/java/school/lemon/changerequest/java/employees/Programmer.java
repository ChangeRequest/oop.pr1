package school.lemon.changerequest.java.employees;

public class Programmer extends Employee {


    public Programmer() {
        super();
    }

    public Programmer(double monthlySalary, int workedHours) {
        super(monthlySalary, workedHours);
    }

    public Programmer(double monthlySalary) {
        super(monthlySalary);
    }

    public double getCurrentSalary() {
        double result = monthlySalary * getRatioOfWorkedHours();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programmer{");
        sb.append("monthlySalary=").append(monthlySalary);
        sb.append(", workedHours=").append(workedHours);
        sb.append('}');
        return sb.toString();
    }
}
