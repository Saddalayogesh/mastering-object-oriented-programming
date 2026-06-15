import java.util.Scanner;

class Counter {
    int evenCount = 0;
    int oddCount = 0;

    void countNumber(int num) {
        if (num % 2 == 0) {
            evenCount++;
        } else {
            oddCount++;
        }
    }

    void displayCount() {
        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Counter counter = new Counter();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            counter.countNumber(num);
        }

        counter.displayCount();

        sc.close();
    }
}