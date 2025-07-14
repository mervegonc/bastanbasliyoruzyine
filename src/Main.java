public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.setName("Laptop");
    product.setId(1);
    product.setDescription("Computer");
    product.setPrice(45800);
    product.setStockAmount(56);

    ProductManager productManager = new ProductManager();
    productManager.Add(product);
        System.out.println(product.getCode());
    }
//field and attribute

}

