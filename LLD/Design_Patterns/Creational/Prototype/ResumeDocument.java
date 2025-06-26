package LLD.Design_Patterns.Creational.Prototype;

public class ResumeDocument implements Document {
    private String title;
    private String content;

    public ResumeDocument(){
        this.title = "Resume Template";
        this.content = "Resume Document Content";
    }

    @Override
    public ResumeDocument clone(){
        ResumeDocument copy = new ResumeDocument();
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
