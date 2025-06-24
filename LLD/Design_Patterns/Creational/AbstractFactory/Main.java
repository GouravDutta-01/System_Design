package LLD.Design_Patterns.Creational.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Using Razorpay in India
        CheckoutService indiaCheckout = new CheckoutService(new IndiaFactory(), "Razorpay");
        indiaCheckout.completeOrder(50000);

        // Using Stripe in US
        CheckoutService usCheckout = new CheckoutService(new USFactory(), "Stripe");
        usCheckout.completeOrder(200);
    }
}

/*
    Output : 
    Processing INR payment via Razorpay : 50000.0
    Generating Indian Invoice...
    Processing USD payment via Stripe : 200.0
    Generating US Invoice...
*/
 