import java.util.Scanner;

public class Solution {

    static int operationCount = 0;

    public static int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    public static int subtract(int a, int b) {
        operationCount++;
        return a - b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + subtract(a, b));
        System.out.println("Operations performed: " + operationCount);

        sc.close();
    }
}