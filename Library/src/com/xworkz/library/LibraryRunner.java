package com.xworkz.library;

import lib.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Library library=new Library();
        Book book=new Book();
        book.setBookName("Rich dad");
        book.setBookId(43);
        library.addBook(book);


        Book book1=new Book();
        book1.setBookName("Bhagathveetha");
        book1.setBookId(832);
        library.addBook(book1);


        Book book2=new Book();
        book2.setBookName("Deep learning");
        book2.setBookId(32);
        library.addBook(book2);

        library.isUpdate(67,32);

        library.getAllData();

        System.out.println("main ended");
    }
}
