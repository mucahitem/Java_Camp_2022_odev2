public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setId(1);
        product.setName("Bilgisayar");
        product.setDescription("Siyah bilgisayar");
        product.setPrice(15000);
        product.setRenk("siyah");
//        product.stockAmount = 100;
//        System.out.println(product.id);
//        System.out.println(product.name);
//        System.out.println(product.description);
//        System.out.println(product.price);
//        System.out.println(product.stockAmount);
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}