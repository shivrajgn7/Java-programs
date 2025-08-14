class Platform{
	int platformNo[];
	Bus bus;
	Platform(int platformNo[],Bus bus)){
		this.platformNo=platformNo;
		this.bus=bus;
	}
	
	void getPlatform(){
	System.out.println("Nummber of platforms : "+platformNo);
	for(int dd:platformNo)
	System.out.println(dd);
	this.bus.getBus();
	
	}


}