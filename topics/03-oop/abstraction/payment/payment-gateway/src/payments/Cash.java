package payments;

public class Cash extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("You successfully paid:" + amount + "php");
    }
}
