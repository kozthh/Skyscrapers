package topics.Foundations.input_output_and_debugging.Basics.HandsOnExcercises.Array.QuizApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizApp {

    private static final String[] QUESTIONS = {
            "1. Enter the name of the national hero of the Philippines:",
            "2. In what province was the national hero of the Philippines born?",
            "3. What is the national food of the Philippines?"
    };

    private static final String[] ANSWERS = {"JOSE RIZAL", "LAGUNA", "ADOBO"};

    private static final ArrayList<String> userAnswers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Welcome to the quiz app\n" +
                    "1. Take the quiz\n" +
                    "2. Show result\n" +
                    "3. Exit");
            System.out.print("Choose an option: ");

            switch (readChoice(in)) {
                case 1:
                    takeQuiz(in);
                    break;
                case 2:
                    showResult();
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Wrong choice. Please enter 1, 2, or 3.\n");
            }
        }

        System.out.println("Thank you for using the quiz app.");
        in.close();
    }

    private static int readChoice(Scanner in) {
        if (!in.hasNextInt()) {
            in.next();
            return -1;
        }
        int choice = in.nextInt();
        in.nextLine();
        return choice;
    }

    private static void takeQuiz(Scanner in) {
        userAnswers.clear();
        for (String question : QUESTIONS) {
            System.out.println(question);
            userAnswers.add(in.nextLine().trim().toUpperCase());
        }
        System.out.println("Quiz completed! Select 2 to see your result.\n");
    }

    private static void showResult() {
        if (userAnswers.isEmpty()) {
            System.out.println("No quiz taken yet. Select 1 to take the quiz.\n");
            return;
        }

        int score = 0;
        for (int i = 0; i < ANSWERS.length; i++) {
            if (userAnswers.get(i).equals(ANSWERS[i])) {
                score++;
            }
        }
        System.out.println("Your score is: " + score + " out of " + ANSWERS.length + "\n");
    }
}
