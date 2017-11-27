package school.lemon.changerequest.java.employees;

public class Accountant extends Employee {

    public Accountant() {
        super();
    }

    public Accountant(double monthlySalary, int workedHours) {
        super(monthlySalary, workedHours);
    }

    public Accountant(double monthlySalary) {
        super(monthlySalary);
    }

    public double calculateAllSalary(Employee[] employees) {
        double result = 0;
        for (Employee worker : employees)
            result += worker.getEarnedSalary();
        result += getEarnedSalary();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Accountant{");
        sb.append("monthlySalary=").append(monthlySalary);
        sb.append(", workedHours=").append(workedHours);
        sb.append('}');
        return sb.toString();
    }
}
