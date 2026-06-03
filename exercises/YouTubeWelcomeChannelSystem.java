import java.util.Scanner;

public class Solution {

    static void welcome() {
        System.out.print("Welcome to the channel: ");
    }

    static void welcome(String name) {
        System.out.print(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();
        String name2 = sc.next();

        if (name1.length() < 4 || name2.length() < 4) {
            System.out.print("Invalid input");
        } else {
            welcome();
            welcome(name1 + " " + name2);
        }

        sc.close();
    }
}