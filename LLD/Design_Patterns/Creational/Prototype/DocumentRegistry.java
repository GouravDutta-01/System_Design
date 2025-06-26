package LLD.Design_Patterns.Creational.Prototype;

import java.util.*;

public class DocumentRegistry {
    private static final Map<String, Document> templates = new HashMap<>();

    static{
        templates.put("resume", new ResumeDocument());
        templates.put("invoice", new InvoiceDocument());
    }

    public static Document getTemplate(String type){
        Document template = templates.get(type);
        if(template == null){
            throw new IllegalArgumentException("Template not found : " + type);
        }
        return template.clone();
    }
}
