package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.BasicLoops.GradeCalculator;

import java.util.Scanner;

public class Calculator {

    private static final int NUMBER_OF_GRADES = 8;

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            double[] grades = new double[NUMBER_OF_GRADES];

            System.out.println("Grade Calculator");
            System.out.println("================");

            for (int i = 0; i < grades.length; i++) {
                grades[i] = readGrade(in, i + 1);
            }

            System.out.println("Average grade is: " + averageOf(grades));
        }
    }

    private static double readGrade(Scanner in, int number) {
        System.out.print("Enter grade " + number + ": ");
        while (!in.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a number.");
            in.next();
            System.out.print("Enter grade " + number + ": ");
        }
        double grade = in.nextDouble();
        in.nextLine();
        return grade;
    }

    private static double averageOf(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
