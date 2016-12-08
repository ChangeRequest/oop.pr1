package school.lemon.changerequest.java.Employees;

/**
 * Created by User on 05.12.2016.
 */
public class Programmer extends Employees {

    private static int countProgrammer;
    public Programmer(String nameE,int workHoursE) {
        super(nameE, workHoursE);
        countProgrammer++;
        Manager.SalaryOverAll=Manager.SalaryOverAll+getSalary();
    }

    @Override
    public double getSalary() {

        return getRatio()*salaryPer160;


    }
    public void setSalaryPer160(int n){
    salaryPer160=n;
}
    public static int getCount() {
        return countProgrammer;
}
}


