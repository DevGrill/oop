package me.devgrill.wahrenkorb;

public class WahrenKorb {
    public String productName = "";
    public int allProducts = 0;
    public int quantity = 0;
    public String[] products = new String[100];

    public WahrenKorb(String produktname, int quantity, int allProducts) {
        this.productName = produktname;
        this.quantity = quantity;
        this.allProducts = allProducts;
    }

    public void newProduct(){
        allProducts++;
        addProduct();
    }

    public void addProduct(){
        System.out.println(products.length);
    }

    public String refreshQuantity(){
        String newQuantity = Integer.toString(allProducts);
        return newQuantity;
    }

}
