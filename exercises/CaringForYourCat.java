import java.util.Scanner;

class Cat {
    int age;
    int weight;

    Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    void checkHealth() {
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);

        if (age >= 1 && age <= 15 && weight >= 2 && weight <= 10) {
            System.out.println("Health Status: Healthy");
        } else {
            System.out.println("Health Status: Unhealthy");
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int weight = sc.nextInt();

        Cat cat = new Cat(age, weight);
        cat.checkHealth();

        sc.close();
    }
}