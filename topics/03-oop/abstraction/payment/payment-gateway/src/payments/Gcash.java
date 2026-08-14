package payments;

public class Gcash extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with GCash");
    }
}
