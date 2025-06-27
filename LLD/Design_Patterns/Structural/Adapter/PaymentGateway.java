package Adapter;

// Target Interface (Standard interface expected by the CheckoutService)
public interface PaymentGateway {
    void pay(String orderId, double amount);
}
