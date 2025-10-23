public class Product {

    public Product() {
        System.out.println("Siparişin 24 Saat içinde Kargoda.");
    }
    public Product(int id,String name, double unitPrice, String detail) {
        this();
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.detail = detail;

    }
    int id;
    String name;
    double unitPrice;
    String detail;

}
