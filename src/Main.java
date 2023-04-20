import model.product.Product;
import model.product.ProductEXPLimited;
import model.product.ProductEXPUnLimited;
import service.product.ProductManager;

public class Main {
    public static void main(String[] args) {

        ProductManager productList = new ProductManager();
        Product p1 = new ProductEXPLimited();
        Product p2 = new ProductEXPLimited();
        Product p3 = new ProductEXPUnLimited();
        Product p4 = new ProductEXPUnLimited();
        Product p5 = new ProductEXPUnLimited();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.display();

        productList.remove();

        productList.display();

    }
}