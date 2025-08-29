package com.xworkz.webbrowserapp.firefox;

import com.xworkz.webbrowserapp.webbrowser.WebBrowser;

public class FireFox extends WebBrowser {

    public FireFox(){
        super();
        System.out.println("FireFox cons is invoked");
    }
    @Override
    public void toSearch(){
        System.out.println("to search the information of all sites");
    }

}
