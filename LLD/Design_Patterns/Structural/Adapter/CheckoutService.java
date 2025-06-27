package Adapter;

// Client Class (Uses PaymentGateway interface to process payments)
public class CheckoutService {
    private PaymentGateway paymentGateway;

    // Constructor injection for dependency inversion
    public CheckoutService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    // Business logic to perform checkout
    public void checkOut(String orderId, double amount){
        paymentGateway.pay(orderId, amount);
    }
}
