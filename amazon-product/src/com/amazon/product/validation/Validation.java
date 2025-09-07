package com.amazon.product.validation;

import com.amazon.product.store.Store;

public class Validation {
    Store store;
    public boolean getValid(Store store){
        boolean isValid=false;
        boolean isName=false;
        boolean isPrice=false;

        if(store.getProdName()!=null&&!store.getProdName().isEmpty()){
            isName=true;
        }else {
            System.out.println("Name is not valid");
        }
        if(store.getPrice()!=0&&store.getPrice()>0){
            isPrice=true;

        }else{
            System.out.println("Price is not valid");
        }
        if(isName&&isPrice){
            isValid=true;
        }else{
            System.out.println("Not valid product");
        }
        return  isValid;
    }
}
