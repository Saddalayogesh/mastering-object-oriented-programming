import java.util.Scanner;

class HotelBooking {
    int nights;
    int guests;
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking booking = new HotelBooking();

        booking.nights = sc.nextInt();
        booking.guests = sc.nextInt();

        if (booking.nights >= 1 && booking.nights <= 25 &&
            booking.guests >= 1 && booking.guests <= 5) {
            System.out.println("Booking Confirmed");
        } else {
            System.out.println("Booking Canceled");
        }

        sc.close();
    }
}