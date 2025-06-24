package LLD.Design_Patterns.Creational.AbstractFactory;

// Concrete Factory
public class USFactory implements RegionFactory{
    public PaymentGateway createPaymentGateway(String type){
        if(type.equalsIgnoreCase("Stripe")){
            return new StripeGateway();
        }
        else if(type.equalsIgnoreCase("PayPal")){
            return new PaypalGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for US : " + type);
    }
    public Invoice createInvoice(){
        return new USInvoice();
    }
}
