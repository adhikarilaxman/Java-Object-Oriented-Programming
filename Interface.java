interface Printable{
    void print();
}
class Document implements Printable{
    public void print(){
        System.out.println("Printing Document");
    }
}
public class Interface{
    public static void main(String[] args){
        Printable p = new Document();
        p.print();
    }
}