package school.lemon.changerequest.java.Employees;

/**
 * Created by User on 05.12.2016.
 */
public class Accountant extends Employees {
    private static int countAccountant;
    public Accountant(String nameE, int workHoursE) {
        super(nameE, workHoursE);
        countAccountant++;
        Manager.SalaryOverAll=Manager.SalaryOverAll+getSalary();
    }
    @Override
    public double getSalary() {
        if (getRatio()<=1){return getRatio()*salaryPer160;}
        else return  salaryPer160;

    }
    public static int getCount() {
        return countAccountant;
    }


}
