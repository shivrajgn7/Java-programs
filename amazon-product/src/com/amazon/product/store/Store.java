package com.amazon.product.store;

public class Store {
    private String prodName;
    private  double price;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
