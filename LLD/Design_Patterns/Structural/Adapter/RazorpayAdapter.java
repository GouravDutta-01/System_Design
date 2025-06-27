package Adapter;

// Adapter Class (Allows RazorpayAPI to be used where PaymentGateway is expected)
public class RazorpayAdapter implements PaymentGateway { 
    private RazorpayAPI razorpayAPI;

    public RazorpayAdapter(){
        this.razorpayAPI = new RazorpayAPI();
    }

    // Translates the pay() call to RazorpayAPI's makePayment() method
    @Override
    public void pay(String orderId, double amount){
        razorpayAPI.makePayment(orderId, amount);
    }
    
}
