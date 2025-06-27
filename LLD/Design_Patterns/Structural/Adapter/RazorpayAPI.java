package Adapter;


// Adaptee (An existing class with an incompatible interface)
public class RazorpayAPI {
    public void makePayment(String orderId, double amount){
        System.out.println("Processing payment of Rs. " + amount + " for Order ID : " + orderId + " via Razorpay");
    }
    
}
