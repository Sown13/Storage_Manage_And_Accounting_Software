import manager.queue.ProductQueue;
import manager.queue.ProductQueueManager;
import manager.user.UserManager;
import model.note.GoodsDeliveryNote;
import model.note.GoodsReceiveNote;
import model.note.Note;
import model.product.Product;
import model.product.ProductEXPLimited;
import model.product.ProductEXPUnLimited;
import model.user.User;
import model.user.UserFactory;

public class Main {
    public static void main(String[] args) {

        ProductQueueManager list = new ProductQueueManager();

        Product p1 = new ProductEXPLimited("sp1");
        p1.setProductSellPrice(10000d);
        Product p2 = new ProductEXPLimited("sp1");
        Product p3 = new ProductEXPUnLimited("sp3");
        Product p4 = new ProductEXPUnLimited("sp4");
        Product p5 = new ProductEXPUnLimited("sp5");

        ProductQueue q1 = new ProductQueue(5,p1);
        ProductQueue q2 = new ProductQueue(6,p2);
        ProductQueue q3 = new ProductQueue(1,p3);
        ProductQueue q4 = new ProductQueue(0,p4);
        ProductQueue q5 = new ProductQueue(-5,p5);

        list.add(q1);
        list.add(q2);
        list.add(q3);
        list.add(q4);
        list.add(q5);
//        list.display();
        ProductQueueManager list2 = new ProductQueueManager();
        list2.display();
//        list.edit();
//        list.display();

        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.createUser("Accountant","son","123","nguyen hai son");
        User user2 = userFactory.createUser("StoreKeeper","sonSK","123","nguyen hai son");
        UserManager.getUserManager().add(user1);
        UserManager.getUserManager().add(user2);
        UserManager.getUserManager().display();

        Note receive1 = new GoodsReceiveNote("sp1",5);
        Note receive2 = new GoodsReceiveNote("sp6",6);
        list.display();
        Note delivery1 = new GoodsDeliveryNote("sp1",16);
        list.display();
    }
}