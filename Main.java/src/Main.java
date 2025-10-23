public class Main {
    // eticaretsitesiçalısmam //

    public static void main(String[] args) {

        Product product1 = new Product(1,"Lenovo V15 512GB ssd",23.000,"Lenovo V15, 512GB ssd, 16GB ram bellek, Windows 11 Pro, Amd Ryzen7");


        //Product product1 = new Product();//
        //product1.id=1;
        //product1.name="Lenovo V15 512GB ssd";
        //product1.unitPrice= 23.000;
        //product1.detail="Lenovo V15, 512GB ssd, 16GB ram bellek, Windows 11 Pro, Amd Ryzen7";

        Product product2 = new Product();
        product2.id=2;
        product2.name="Lenovo Legion 1TB ssd";
        product2.unitPrice= 64.999;
        product2.detail="Legion 5,Intel core i7, 24GB ram bellek, Windows 11 Pro, 1TB Sdd";

        Product product3 = new Product();
        product3.id=3;
        product3.name="Asus Zenbook 14";
        product3.unitPrice= 59.099;
        product3.detail="Zenbook 14, Intel core ulta 9, 32GB ram bellek,Windows 11 Home, 1TB ssd";

        Product product4 = new Product();
        product4.id=4;
        product4.name="HP Victus Gaming";
        product4.unitPrice= 27.999;
        product4.detail="Victus Gaming 15, Intel core i5, 16GB ram bellek,512GB ssd, Freedos";



       Product[] products = {product1,product2,product3,product4};



       for (Product product : products) {

           System.out.println(product.name);
       }

       System.out.println(products.length);

       Category category1 = new Category();
       category1.id=1;
       category1.name="Bilgisayar";

       Category category2 = new Category();
       category2.id = 2;
       category2.name = "Tablet";

       ProductManager productManager = new ProductManager();
       productManager.addToCart(product1);

       productManager.addToCart(product2);

       productManager.addToCart(product3);

       productManager.addToCart(product4);

    }
}