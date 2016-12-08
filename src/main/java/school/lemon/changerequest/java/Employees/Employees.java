package school.lemon.changerequest.java.Employees;

/**
 * Created by User on 05.12.2016.
 */
public class Employees {
    public Employees(String nameE,int workHoursE){
        name=nameE;
        workHours=workHoursE;

    }

public String getName(){
    return name;}

    public double getSalary(){
        return salary;
    }
    public void SetSalary(int salarySet){
        salary=salarySet;
    }
    public double getRatio(){
    return (double)(workHours)/(double)(workHoursPerMonth);
}
    public void setCount(){

    }
    public String getJob(){
    return job;}



    protected String name;
    protected String job;
    protected  double salary;
    protected  int workHours;
     final int workHoursPerMonth= 160;
    protected  int salaryPer160= 100;

}