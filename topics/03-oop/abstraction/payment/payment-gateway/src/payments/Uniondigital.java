package payments;

public class Uniondigital extends PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with UnionDigital");
    }
}
