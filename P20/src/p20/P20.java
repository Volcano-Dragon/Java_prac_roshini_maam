package p20;

class Product{
    int ID;
    String name = "NULL";
    float price;
    void check_po(int a){
        System.out.println("Product wala hai");}
}
class books extends Product{
    String name = "NCERT";
    void check_po(int a){
        System.out.println("books wala hai");}
    int pages;
}
class Cloth extends Product{
    int size;
    void check_po(int a){
        System.out.println("cloth wla hai");  
    }
}
class electronic extends Product{
    String name;
    int power_consumtion;}

public class P20 {

    public static void main(String[] args) {
        Product p = new Product();
        books b = new books();
        Cloth c = new Cloth();
        p.check_po(6);
        b.check_po(4);
        c.check_po(5);
    
    }
    
}
