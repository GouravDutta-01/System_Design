package LLD.Design_Patterns.Creational.Prototype;

public interface Document extends Cloneable {
    Document clone();
    void setContent(String content);
    void print();
}
