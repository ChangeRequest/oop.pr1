package school.lemon.changerequest.java.Employees;

/**
 * Created by lbrdev on 04.01.2017.
 * Project: oop.pr1
 */
public class Test {
    public static void main(String[] args) {
//
        Employee[] employee = new Employee[6];

        employee[0] = new Programmer("One");
        employee[0].setSalary(Employee.DEFAULT_SALARY);
        employee[0].setHours(80);

        employee[1] = new Programmer("Two");
        employee[1].setSalary(Employee.DEFAULT_SALARY);
        employee[1].setHours(320);

        employee[2] = new Accountant("Three");
        employee[2].setSalary(Employee.DEFAULT_SALARY);
        employee[2].setHours(80);

        Accountant accountant = new Accountant("Four");
        accountant.setSalary(Employee.DEFAULT_SALARY);
        accountant.setHours(320);
        employee[3] = accountant;

        employee[4] = new Manager("Five");
        employee[4].setSalary(Employee.DEFAULT_SALARY);
        employee[4].setHours(80);

        employee[5] = new Manager("Six");
        employee[5].setSalary(Employee.DEFAULT_SALARY);
        employee[5].setHours(320);

        System.out.println("Employees salary is " + accountant.overallSalary(employee));
        System.out.printf("Programmer %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[0].getSalary(), employee[0].getHours(), (int) employee[0].calculateSalary(), employee[0].getName());
        System.out.printf("Programmer %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[1].getSalary(), employee[1].getHours(), (int) employee[1].calculateSalary(), employee[1].getName());
        System.out.printf("Accountant %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[2].getSalary(), employee[2].getHours(), (int) employee[2].calculateSalary(), employee[2].getName());
        System.out.printf("Accountant %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[3].getSalary(), employee[3].getHours(), (int) employee[3].calculateSalary(), employee[3].getName());
        System.out.printf("Manger %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[4].getSalary(), employee[4].getHours(), (int) employee[4].calculateSalary(), employee[4].getName());
        System.out.printf("Manger %4$s with salary %1$d worked %2$d hours - salary is %3$d \n", employee[5].getSalary(), employee[5].getHours(), (int) employee[5].calculateSalary(), employee[5].getName());


    }
}
