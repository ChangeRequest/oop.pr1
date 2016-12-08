package school.lemon.changerequest.java.Employees;

/**
 * Created by User on 05.12.2016.
 */
public class Manager extends Employees{
    protected static double SalaryOverAll;
    public Manager(String nameE, int salaryE) {
        super(nameE,salaryE);
        Manager.SalaryOverAll=Manager.SalaryOverAll+getSalary();
    }
    @Override
    public double getSalary() {
        if (getRatio()<=1){return getRatio()*salaryPer160;}
        else return  salaryPer160;

    }
    public void setSalaryPer160(int n){
        salaryPer160=n;
    }
    public double SalaryOverAll(){



        return   SalaryOverAll;
    }
}