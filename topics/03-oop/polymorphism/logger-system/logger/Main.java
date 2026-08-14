package logger;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose logger (console, file, db): ");
        String choice = scanner.nextLine();
        scanner.close();

        LoggerSwitcher switcher = new LoggerSwitcher();
        Logging logger = switcher.selectLogger(choice);
        logger.input();
    }
}
