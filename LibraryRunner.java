class LibraryRunner{

	public static void main(String[]study){
	
	String books[]={"To Kill a Mockingbird "," 1984 "," The Great Gatsby "," Pride and Prejudice "," The Catcher in the Rye  "," The Alchemist "," Harry Potter and the Sorcerer's Stone "," The Hobbit "," The Kite Runner "," Atomic Habits "," The Da Vinci Code "," The Book Thief"};
	
	Library learn=new Library(books,57,"Banglore","Karnataka");
	learn.book=books;
	System.out.println(+learn.libraryId+learn.city+learn.state);
	
	learn.getLibrary();
	
	}



}