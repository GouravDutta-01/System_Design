package LLD.Design_Patterns.Creational.Prototype;

public class Main {

    public static void main(String[] args) {
        Document doc1 = DocumentRegistry.getTemplate("resume");
        doc1.setContent("Gourav Dutta - Software Engineer");

        Document doc2 = DocumentRegistry.getTemplate("resume");
        doc2.setContent("John Doe - Data Scientist");

        Document doc3 = DocumentRegistry.getTemplate("invoice");
        doc3.setContent("Invoice #123");

        doc1.print();
        doc2.print();
        doc3.print();
    }
    
}

/*
    Output : 
    [Resume Template] Gourav Dutta - Software Engineer
    [Resume Template] John Doe - Data Scientist
    [Invoice Template] Invoice #123
*/
