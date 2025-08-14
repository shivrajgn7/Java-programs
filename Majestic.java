class Majestic{

	String city;
	//Platform platform;
	int noPlat[]={5,2,4,6,1,7};
	
	Platform platform=new Platform(noPlat,bus);
	//platform.platformNo=noPlat;
	//System.out.println("pp: "+platform.bus);
	//platform.bus=bus;
	
	void getMajestic(){
	System.out.println("City name : "+city);
	this.platform.getPlatform();
	
	
	}


}