import java.util.Scanner;

class Employee1 {
    String name;

    Employee1(String name) {
        this.name = name;
    }

    public void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: Employee");
    }
}

class Manager extends Employee1 {

    Manager(String name) {
        super(name);
    }

    public void showManager() {
        System.out.println("Manager Name: " + name);
        System.out.println("Designation: Manager");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String empName = scanner.next();
        String mgrName = scanner.next();

        Employee1 emp = new Employee1(empName);
        Manager mgr = new Manager(mgrName);

        emp.showEmployee();
        mgr.showManager();

        scanner.close();
    }
}