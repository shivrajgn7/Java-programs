class Country{
	String countryName[];
	String oneName;
	State state;
	Country(String countryName[],String oneName){
		this.countryName=countryName;
		this.state=state;
		
		
	}
	void getCountry(){
	System.out.println("Country names: "+countryName);
	System.out.println("Country name: "+oneName);
	this.state.getState();
	
	}


}