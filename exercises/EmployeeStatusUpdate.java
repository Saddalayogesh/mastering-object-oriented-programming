import java.util.Scanner;

public class Solution {

    public static void PrintDefaultStatus() {
        System.out.print("Employee statuses: ");
    }

    public static void UpdateStatus(String name, boolean status) {
        if (status) {
            System.out.println("Employee " + name + " is currently active.");
        } else {
            System.out.println("Employee " + name + " is currently inactive.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        boolean status = sc.nextBoolean();

        PrintDefaultStatus();
        UpdateStatus(name, status);
    }
}