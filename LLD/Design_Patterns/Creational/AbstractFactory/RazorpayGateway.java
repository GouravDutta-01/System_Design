package LLD.Design_Patterns.Creational.AbstractFactory;

public class RazorpayGateway implements PaymentGateway{
    public void processPayment(double amount){
        System.out.println("Processing INR payment via Razorpay : " + amount);
    }  
}
