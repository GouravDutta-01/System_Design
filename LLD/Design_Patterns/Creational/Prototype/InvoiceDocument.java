package LLD.Design_Patterns.Creational.Prototype;

public class InvoiceDocument implements Document {
    private String title;
    private String content;

    public InvoiceDocument(){
        this.title = "Invoice Template";
        this.content = "Invoice Document Content";
    }

    @Override
    public InvoiceDocument clone(){
        InvoiceDocument copy = new InvoiceDocument();
        copy.title = title;
        copy.content = content;
        return copy;
    }

    @Override
    public void setContent(String content){
        this.content = content;
    }

    @Override
    public void print(){
        System.out.println("[" + title + "] " + content);
    }
    
}
