package school.lemon.changerequest.java;

/**
 * Created by lera on 17.12.16.
 */
public class APP {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];

        employees[0] = new Programmer("Dmytro");
        employees[0].setSalary(100.);
        employees[0].setWorkedHours(80);

        employees[1] = new Programmer("Iurii");
        employees[1].setSalary(100.);
        employees[1].setWorkedHours(320);

        employees[2] = new Accountant("Hilary");
        employees[2].setSalary(100.);
        employees[2].setWorkedHours(80);

        Accountant accountant = new Accountant("Jesica"); //calculate overall salary for all accountable employees (including himself)
        accountant.setSalary(100.);
        accountant.setWorkedHours(320);
        employees[3] = accountant;

        employees[5] = new Manager("Emma");
        employees[5].setSalary(100.);
        employees[5].setWorkedHours(80);

        employees[4] = new Manager("Artur");
        employees[4].setSalary(100.);
        employees[4].setWorkedHours(320);


        System.out.println("Employees salary is " + accountant.calcSalary(employees));
        // All examples from task 2."Employees"
        System.out.println("Programmer with salary 100$ worked 80 hours has current month salary is " + employees[0].calculateSalary());
        System.out.println("Programmer with salary 100$ worked 320 hours has current month salary is " + employees[1].calculateSalary());
        System.out.println("Accountant with salary 100$ worked 80 hours has current month salary is " + employees[2].calculateSalary());
        System.out.println("Manager with salary 100$ worked 80 hours has current month salary is " + employees[5].calculateSalary());
        System.out.println("Accountant with salary 100$ worked 320 hours  has current month salary is " + employees[3].calculateSalary());
        System.out.println("Manager with salary 100$ worked 320 hours  has current month salary is " + employees[4].calculateSalary());
    }
}
