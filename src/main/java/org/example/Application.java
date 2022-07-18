import model.ComponentItem;
import model.Product;
import model.Box;

public class Application {
    public static void main(String[] args) {

        ComponentItem product1 = new Product(100.);
        ComponentItem product2 = new Product(50.12);
        ComponentItem product3 = new Product(70.13);
        ComponentItem product4 = new Product(150.);
        ComponentItem product5 = new Product(200.);

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        Box outerBox = new Box();

        box1.addComponent(product1)
                .addComponent(product2);
        box3.addComponent(product3);
        box2.addComponent(box3);
        outerBox.addComponent(box1).addComponent(box2);
        System.out.println(outerBox.calcPrice());
    }
}
