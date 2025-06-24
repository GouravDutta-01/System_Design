package LLD.Design_Patterns.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        Notification smsNotification = NotificationFactory.createNotification("sms");// Create an SMS notification using the factory
        smsNotification.notifyUser();
        Notification emailNotification = NotificationFactory.createNotification("email");// Create an Email notification using the factory
        emailNotification.notifyUser();
    }
    
}

/*
    Output : 
    Sending an SMS Notification
    Sending an Email Notification
*/
