package payments;
import java.util.Scanner;

import payments.PaymentFactory;

public class PaymentGatewayApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentFactory paymentFactory = new PaymentFactory();

        String[] methods = {"gcash", "maya", "uniondigital", "cash"};

        System.out.println("Select payment method: \n 1. gcash \n 2. maya \n 3. uniondigital \n 4. cash \n 5. exit");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter payment amount: ");
            double amount = scanner.nextDouble();
            paymentFactory.pay(methods[choice - 1], amount);
        } else if (choice == 5) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice. Please try again.");
        }
        scanner.close();
    }
}
