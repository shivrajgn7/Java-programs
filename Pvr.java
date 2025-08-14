class Pvr{
	String mallName;
	String location;
	double price;
	boolean isNightShow;
	
	Screen screen;
	Pvr(	String mallName,String location,double price,boolean isNightShow){
		this.mallName=mallName;
		this.location=location;
		this.price=price;
		this.isNightShow=isNightShow;
		
	}
	
	void getPvr(){
	System.out.println("Mall Name: "+mallName);
	System.out.println("Locaton: "+location);
	System.out.println("Price: "+price);
	System.out.println("is night show alavilable : "+isNightShow);
	this.screen.getScreen();
	}



}