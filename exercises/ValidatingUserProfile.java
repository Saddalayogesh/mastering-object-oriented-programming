import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int age = sc.nextInt();

        if (age < 1 || age > 100) {
            System.out.println("Invalid Age");
        } else {
            Person person = new Person(name, age);
            System.out.println("Name: " + person.name);
            System.out.println("Age: " + person.age);
        }

        sc.close();
    }
}