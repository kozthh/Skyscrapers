package payments;

public class Maya extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with maya");
    }
}
