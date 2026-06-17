import java.util.Scanner;

class Employee {
    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    void displaySalary() {
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    int bonus;

    Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }

    void displaySalary() {
        System.out.println("Manager Salary: " + (salary + bonus));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empSalary = sc.nextInt();
        int mgrSalary = sc.nextInt();
        int bonus = sc.nextInt();

        Employee emp = new Employee(empSalary);
        Manager mgr = new Manager(mgrSalary, bonus);

        emp.displaySalary();
        mgr.displaySalary();

        sc.close();
    }
}