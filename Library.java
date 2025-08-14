class Library{

	String book[];
	int libraryId;
	String city;
	String state;
	
	Library(String book[],int libraryId,String city,String state){
		
		this.book=book;
		this.libraryId=libraryId;
		this.city=city;
		this.state=state;
		
	}
	void getLibrary(){
		for(String bb:book)
			System.out.println(bb);
		
		
	}
	


}