public class Main {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.id=1;
        product.name="elma";
        product.price=15.56;
        manager.add(product);
    }

}




