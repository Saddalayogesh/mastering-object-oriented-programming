import java.util.Scanner;

class Student {
    int id;
    int age;
    int grade;

    Student(int id, int age, int grade) {
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    void printDetails() {
        System.out.println("Student ID: " + id + ", Age: " + age + ", Grade: " + grade);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        int age = sc.nextInt();
        int grade = sc.nextInt();

        if (id <= 0 || age <= 0 || grade <= 0) {
            System.out.println("Invalid input");
        } else {
            Student s = new Student(id, age, grade);
            s.printDetails();
        }

        sc.close();
    }
}