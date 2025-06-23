package LLD.Design_Patterns.Creational.Factory;

public class EmailNotification implements Notification {
    public void notifyUser(){
        System.out.println("Sending an Email Notification");
    }   
}
