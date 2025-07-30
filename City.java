class City{
	String street2[];
	String cityId;
	String cityName;
	String state;
	City(String cityId,String cityName,String state,String street[]){
	this.cityId	=cityId;
	this.cityName=cityName;
	this.state=state;
	this.street2=street2;
	}
	City(){
	}
	void getCity(){
		System.out.println("City id is: "+cityId);
		System.out.println("City name is: "+cityName);
		System.out.println("City statee: "+state);
		
		for(String ss:street2)
			System.out.println(ss);
		
	}

}