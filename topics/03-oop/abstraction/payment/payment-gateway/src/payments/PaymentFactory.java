package payments;

public class PaymentFactory {

    public void pay(String type, double amount) {
        switch (type) {
            case "gcash":
                new Gcash().pay(amount);
                break;
            case "maya":
                new Maya().pay(amount);
                break;
            case "uniondigital":
                new Uniondigital().pay(amount);
                break;
            case "cash":
                new Cash().pay(amount);
                break;
            default:
                System.out.println("Unsupported payment type: " + type);
        }
    }
}
