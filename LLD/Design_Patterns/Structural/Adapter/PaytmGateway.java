package Adapter;

// Concrete implementation of PaymentGateway for Paytm
public class PaytmGateway implements PaymentGateway {

    @Override
    public void pay(String orderId, double amount){
        System.out.println("Processing payment of Rs. " + amount + " for Order ID : " + orderId + " via Paytm");
    }
 
}
