public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.name ="Laptop";
    product.id = 1;
    product.description ="Computer";
    product.price = 45800;
    product.stockAmount =56;

    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    }
//field and attribute

}

