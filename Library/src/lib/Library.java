package lib;

import com.xworkz.library.Book;

public class Library {
    Book[] books=new Book[3];
    int index;

    public boolean addBook(Book book){
        boolean isadd=false;
        if(book!=null){
            books[index++]=book;

        }else{
            System.out.println("Invalid to add");
        }
    return isadd;
    }

    public boolean isUpdate(int updateid,int existingid){
        System.out.println("update value is invoking");
        boolean isvalid=false;
        for (Book book:books) {
            if (book.getBookId() == existingid) {
                book.setBookId(updateid);
                System.out.println("Id is updated");
            }
            if(isvalid) System.out.println("The id of "+existingid+"is not updated");

        }

        return isvalid;
    }



    public void  getAllData(){
        System.out.println("the book list");
        for(Book booklist:books){
            System.out.println("The book id: "+booklist.getBookId());
            System.out.println("The book name: "+booklist.getBookName());

        }
    }
}
