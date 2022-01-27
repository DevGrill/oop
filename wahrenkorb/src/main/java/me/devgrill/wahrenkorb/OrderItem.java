package me.devgrill.wahrenkorb;

public class OrderItem {
    private String productName;
    private int amount;

    public OrderItem(String productName, int amount) {
        this.productName = productName;
        this.amount = amount;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public String getProductName(){
        return productName;
    }

    public int getAmount(){
        return amount;
    }

    @Override
    public String toString(){
        return this.productName + " " + this.amount;
    }
}
