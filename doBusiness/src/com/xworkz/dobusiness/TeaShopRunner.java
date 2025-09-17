package com.xworkz.dobusiness;

import com.xworkz.dobusiness.teaShop.TeaShop;

import javax.xml.stream.events.Comment;

public class TeaShopRunner {
    public static void main(String[] args) {
        ComercialSpace comercialSpace=new TeaShop();
        comercialSpace.doBusiness();
    }
}
 