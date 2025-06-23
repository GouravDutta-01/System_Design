package LLD.Design_Patterns.Creational.Factory;

// Factory class to create Notification objects based on input type
public class NotificationFactory {

    // Factory method that returns a Notification object based on the type
    public static Notification createNotification(String type){
        if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        }
        else if(type.equalsIgnoreCase("Push")){
            return new PushNotification();
        }
        else{
            throw new IllegalArgumentException("Unknown type : " + type);
        }
    }
    
}
