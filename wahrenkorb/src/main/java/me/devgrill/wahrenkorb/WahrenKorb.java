package me.devgrill.wahrenkorb;

public class WahrenKorb {
    public String produktname = "";
    public int quantity = 0;
    public String[] products = new String[100];
    public int allproducts = 0;

    public WahrenKorb(String produktname, int quantity) {
        this.produktname = produktname;
        this.quantity = quantity;
    }

    public void newProduct(){
        allproducts++;
        addproduct();
    }

    public void addproduct(){
        System.out.println(products.length);
    }

    public String refreshQuantity(){
        String newQuantity = Integer.toString(allproducts);
        return newQuantity;
    }

}
