import java.util.Scanner;

class Payment {
    void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}

class CreditCard extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

class Bitcoin extends Payment {
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Bitcoin payment of $" + amount);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        double amount = sc.nextDouble();

        Payment payment;

        switch (choice) {
            case 1:
                payment = new CreditCard();
                break;
            case 2:
                payment = new PayPal();
                break;
            case 3:
                payment = new Bitcoin();
                break;
            default:
                return;
        }

        payment.processPayment(amount);

        sc.close();
    }
}