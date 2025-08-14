class LibraryRunner{

	public static void main(String[] read){
	
	Book book=new Book();
	int bookId=87;
	String bookName="Deep learn";
	String bookSize="medium";
	book.bookId=bookId;
	book.bookName=bookName;
	book.bookSize=bookSize;
	
	Shelf shelf=new Shelf();
	int noShelf=87;
	shelf.noShelf=noShelf;
	shelf.book=book;
	
	Library library=new Library();
	int libraryId=32;
	String libraryName="Central Library";
	library.libraryId=libraryId;
	library.libraryName=libraryName;
	library.shelf=shelf;
	library.getLibrary();
	}
}