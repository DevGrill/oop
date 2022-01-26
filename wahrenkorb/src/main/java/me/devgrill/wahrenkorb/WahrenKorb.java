package me.devgrill.wahrenkorb;

public class WahrenKorb {
    public String produktname = "";
    public int allproducts = 0;
    public int quantity = 0;
    public String[] products = new String[100];

    public WahrenKorb(String produktname, int quantity, int allproducts) {
        this.produktname = produktname;
        this.quantity = quantity;
        this.allproducts = allproducts;
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
