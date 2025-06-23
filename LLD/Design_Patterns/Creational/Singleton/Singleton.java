package LLD.Design_Patterns.Creational.Singleton;
public class Singleton{
    // volatile keyword ensures changes made by one thread are visible to others. 
    // volatile ensures that the instance is always read from the main memory, so all threads see the most up-to-date version.
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton(){

    }

    // Double checked locking for thread safe lazy loading
    public static Singleton getInstance(){
        if(instance == null){// First check(no locking)
            // The synchronized keyword ensures that only one thread at a time can execute the getInstance() method.
            synchronized (Singleton.class){
                if(instance == null){//Second check(with locking)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    } 

}