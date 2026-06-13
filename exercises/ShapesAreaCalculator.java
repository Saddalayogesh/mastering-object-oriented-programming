import java.util.Scanner;

class Shape {
    void area() {
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        int area = (int) Math.round(Math.PI * radius * radius);
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int shapeType = sc.nextInt();

        if (shapeType == 1) {
            int radius = sc.nextInt();

            if (radius >= 0 && radius < 100) {
                Shape shape = new Circle(radius);
                shape.area();
            } else {
                System.out.println("Invalid input");
            }

        } else if (shapeType == 2) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();

            if (length >= 0 && length < 100 &&
                breadth >= 0 && breadth < 100) {
                Shape shape = new Rectangle(length, breadth);
                shape.area();
            } else {
                System.out.println("Invalid input");
            }

        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}