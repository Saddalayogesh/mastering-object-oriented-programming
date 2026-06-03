import java.util.Scanner;

public class Solution {

    public static int calculateArea(int length, int width) {
        return length * width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int width = sc.nextInt();

        if (length < 0 || width < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(calculateArea(length, width));
        }

        sc.close();
    }
}