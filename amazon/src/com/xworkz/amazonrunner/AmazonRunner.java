package com.xworkz.amazonrunner;

import com.xworkz.amazonrunner.amazon.Amazon;
import com.xworkz.amazonrunner.product.Product;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of patients");
        int size=sc.nextInt();
        Amazon amazon=new Amazon(size);
        for(int i=0;i<size;i++) {
            Product product = new Product();
            System.out.println("Enter the product id:");
            int prodId=sc.nextInt();
            product.setProductId(prodId);

            System.out.println("Enter the product Name: ");
            String prodName=sc.next();
            product.setProductName(prodName);

            System.out.println("Enter the price of product:");
            double prodPrice=sc.nextDouble();
            product.setPrice(prodPrice);
            amazon.addProduct(product);
        }
       /* Product product1=new Product();
        product1.setPrice(500);
        product1.setProductName("Shoes");
        product1.setProductId(43);
        amazon.addProduct(product1);

        Product product2=new Product();
        product2.setProductId(43);
        product2.setProductName("laptop");
        product2.setPrice(45000);
        amazon.addProduct(product2);*/






        amazon.getAllData();


    }
}
