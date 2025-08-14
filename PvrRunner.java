class PvrRunner{
	public static void main(String []film){
	
	Movie movie=new Movie("Su from so","10:00 AM to 1:00 PM");
	
	Screen screen=new Screen("23",movie);
	
	Pvr pvr=new Pvr("GT Mall","Banglore",567.09,true);
	pvr.screen=screen;
	pvr.getPvr();
	
	
	}


}