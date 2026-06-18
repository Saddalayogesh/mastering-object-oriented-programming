import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = scanner.nextInt();
        double sum = 0;

        for (int i = 0; i < numStudents; i++) {
            sum += scanner.nextDouble();
        }

        double average = sum / numStudents;

        System.out.printf("%.2f", average);

        scanner.close();
    }
}