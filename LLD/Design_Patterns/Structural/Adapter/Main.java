package Adapter;

public class Main {

    public static void main(String[] args) {
        CheckoutService checkoutPaytm = new CheckoutService(new PaytmGateway());
        checkoutPaytm.checkOut("1", 5000);
        CheckoutService checkoutRazorpay = new CheckoutService(new RazorpayAdapter());
        checkoutRazorpay.checkOut("2", 15000);
    }

    
}

/*
    Output :
    Processing payment of Rs. 5000.0 for Order ID : 1 via Paytm
    Processing payment of Rs. 15000.0 for Order ID : 2 via Razorpay
*/
