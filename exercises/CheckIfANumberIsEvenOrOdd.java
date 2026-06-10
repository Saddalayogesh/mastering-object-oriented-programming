import java.util.Scanner;

public class Solution {

    public static String checkEvenOdd(int num) {
        if (num < 0) {
            return "Invalid input";
        }

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(checkEvenOdd(num));
    }
}