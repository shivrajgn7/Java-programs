package com.xworkz.amazonrunner.amazon;

import com.xworkz.amazonrunner.product.Product;

public class Amazon {

    public Amazon(int size){
        products=new Product[size];

    }

    Product[] products;
    int index;
    public boolean addProduct(Product product){
        boolean isAdded=false;

        if(product!=null){
            products[index++]=product;
            isAdded=true;
        }else{
            System.out.println("Invalid to add");
        }


        return isAdded;
    }

    public void getAllData() {
        System.out.println("The book list");
        for (Product values : products) {
            System.out.println("Product name: " + values.getProductName());
            System.out.println("Product id: " + values.getProductId());
            System.out.println("Product price: " + values.getPrice());


        }
    }


}
