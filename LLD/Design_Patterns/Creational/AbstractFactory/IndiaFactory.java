package LLD.Design_Patterns.Creational.AbstractFactory;

// Concrete Factory
public class IndiaFactory implements RegionFactory{
    public PaymentGateway createPaymentGateway(String type){
        if(type.equalsIgnoreCase("Razorpay")){
            return new RazorpayGateway();
        }
        else if(type.equalsIgnoreCase("Paytm")){
            return new PaytmGateway();
        }
        throw new IllegalArgumentException("Unsupported gateway for India : " + type);
    }
    public Invoice createInvoice(){
        return new IndiaInvoice();
    }
 
}
