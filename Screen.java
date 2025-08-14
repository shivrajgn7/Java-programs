class Screen{
	String screenId;
	Movie movie;
	Screen(String screenId,Movie movie){
		this.screenId=screenId;
		this.movie=movie;
		
	}
	
	void getScreen(){
	System.out.println("Screen id : "+screenId);
	this.movie.getMovie();
	
	}


}