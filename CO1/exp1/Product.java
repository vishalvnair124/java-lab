public class Product {
    String pcode, pname;
    double price;

    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 50000);
        Product p2 = new Product("P002", "Tablet", 25000);
        Product p3 = new Product("P003", "Smartphone", 30000);

        Product lowest = (p1.price < p2.price) ? (p1.price < p3.price ? p1 : p3) : (p2.price < p3.price ? p2 : p3);

        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + lowest.pcode);
        System.out.println("Name: " + lowest.pname);
        System.out.println("Price: " + lowest.price);
    }
}
