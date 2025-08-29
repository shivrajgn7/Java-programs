package com.xworkz.webbrowserapp;

import com.xworkz.webbrowserapp.firefox.FireFox;
import com.xworkz.webbrowserapp.webbrowser.WebBrowser;

public class WebBrowserRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        WebBrowser browser1 = new FireFox();
        browser1.toSearch();

        System.out.println("main ended");

    }
}
