package shapes;

import java.util.Scanner;

public class ShapeOptions {

    public ShapeOptions(Scanner in, int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = in.nextDouble();
                Circle circle = new Circle(radius);
                System.out.println("Area: " + circle.getArea());
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = in.nextDouble();
                System.out.print("Enter width: ");
                double width = in.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Area: " + rectangle.getArea());
                break;
            case 3:
                System.out.print("Enter base: ");
                double base = in.nextDouble();
                System.out.print("Enter height: ");
                double height = in.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Area: " + triangle.getArea());
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
