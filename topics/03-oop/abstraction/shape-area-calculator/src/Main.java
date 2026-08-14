import java.util.Scanner;

import shapes.ShapeOptions;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose a shape:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = scanner.nextInt();
            if (choice == 4) {
                running = false;
                continue;
            }
            new ShapeOptions(scanner, choice);

        }
        scanner.close();
    }
}
