package LLD.Design_Patterns.Creational.AbstractFactory;

//Abstract Factory
public interface RegionFactory {
    PaymentGateway createPaymentGateway(String type);
    Invoice createInvoice();
}
