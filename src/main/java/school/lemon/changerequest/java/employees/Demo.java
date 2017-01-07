package school.lemon.changerequest.java.employees;

/**
 * Created by Yaroslav Pavlinskiy on 06.01.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Stiv");
        programmer.setSalary(100);
        programmer.working(80);
        System.out.println(programmer);

        Manager manager = new Manager("Bob");
        manager.setSalary(100);
        manager.working(80);
        System.out.println(manager);

        Accountant accountant = new Accountant("Gloria");
        accountant.setSalary(100);
        accountant.working(320);
        System.out.println(accountant);
    }
}
