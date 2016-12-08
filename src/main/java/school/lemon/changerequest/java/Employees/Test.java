package school.lemon.changerequest.java.Employees;

/**
 * Created by User on 07.12.2016.
 */
public class Test {
    public static void main(String[] args) {

        Programmer c1= new Programmer("Petro",160);
        System.out.println(c1.getName()+" "+c1.getSalary());
        Programmer c2= new Programmer("Pavlo", 320);
        System.out.println(c2.getName()+" "+c2.getSalary());
        Manager c3= new Manager("Colya",100);
        System.out.println(c3.getName()+" "+c3.getSalary());
        Manager c4=new Manager("Kolya", 999);
        System.out.println(c4.getName()+" "+c4.getSalary());
        Accountant c5=new Accountant("Colya",160);
        System.out.println(c5.getName()+" "+c5.getSalary());
        Accountant c6= new Accountant("Kolya",999);
        System.out.println(c6.getName()+" "+c6.getSalary());

        System.out.println("salary for all accountable employees " + Manager.SalaryOverAll);
    }
}
