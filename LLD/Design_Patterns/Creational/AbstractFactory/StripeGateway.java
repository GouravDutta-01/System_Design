package LLD.Design_Patterns.Creational.AbstractFactory;

public class StripeGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing USD payment via Stripe : " + amount);
    }    
}
