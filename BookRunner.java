package com.java.inheritance.single;

public class BookRunner {
    public static void main(String[] args) {


        Library library = new Library();
        library.setLibName("Vijayanagara");
        library.setBookId(42);
        library.setBookName("obstetrics");
        System.out.println("library name: "+library.getLibName());
        System.out.println("Book name: "+library.getBookName());
        System.out.println("Book Id: "+library.getBookId());
    }
}
