package LLD.Design_Patterns.Creational.AbstractFactory;

public class CheckoutService {
    private PaymentGateway paymentGateway;
    private Invoice invoice;

    public CheckoutService(RegionFactory factory, String gatewayType){
        this.paymentGateway = factory.createPaymentGateway(gatewayType);
        this.invoice = factory.createInvoice();
    }

    public void completeOrder(double amount){
        paymentGateway.processPayment(amount);
        invoice.generateInvoice();
    }
}
