package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.BasicLoops.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {

    private static final int NUMBER_OF_NUMBERS = 5;

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true;

            while (running) {
                System.out.println("Sort the numbers in ascending or descending order:");
                System.out.println("1. Ascending");
                System.out.println("2. Descending");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                switch (readChoice(input)) {
                    case 1:
                        Integer[] ascending = readNumbers(input);
                        Arrays.sort(ascending);
                        System.out.println("Numbers in ascending order: " + Arrays.toString(ascending));
                        break;
                    case 2:
                        Integer[] descending = readNumbers(input);
                        Arrays.sort(descending, Collections.reverseOrder());
                        System.out.println("Numbers in descending order: " + Arrays.toString(descending));
                        break;
                    case 3:
                        running = false;
                        System.out.println("Exiting the program.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            }
        }
    }

    private static Integer[] readNumbers(Scanner input) {
        Integer[] numbers = new Integer[NUMBER_OF_NUMBERS];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            while (!input.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number.");
                input.next();
                System.out.print("Enter number " + (i + 1) + ": ");
            }
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    private static int readChoice(Scanner input) {
        if (!input.hasNextInt()) {
            input.next();
            return -1;
        }
        int choice = input.nextInt();
        input.nextLine();
        return choice;
    }
}
