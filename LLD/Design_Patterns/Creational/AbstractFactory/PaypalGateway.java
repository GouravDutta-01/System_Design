package LLD.Design_Patterns.Creational.AbstractFactory;

public class PaypalGateway implements PaymentGateway {
    public void processPayment(double amount){
        System.out.println("Processing USD payment via Paypal : " + amount);
    } 
}
