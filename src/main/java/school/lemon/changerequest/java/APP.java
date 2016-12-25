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

        employees[3] = new Accountant("Jesica");
        employees[3].setSalary(100.);
        employees[3].setWorkedHours(320);

        employees[4] = new Manager("Emma");
        employees[4].setSalary(100.);
        employees[4].setWorkedHours(80);

        employees[5] = new Manager("Artur");
        employees[5].setSalary(100.);
        employees[5].setWorkedHours(320);

        Accountant accountant = new Accountant(employees);

        System.out.println("Employees salary is " + accountant.calcSalary());


    }
}
