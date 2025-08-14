class CountryRunner{
	public static void main(String[]world){
	String citys[]={"Banglore","Shivamogga","Davenngere","Mysore"};
	City city=new City(citys,"Banglore");
	
	String states[]={"Karnataka","Maharastra","Goa","Tamil Nadu"};
	State state=new State(states,states[0]);
	state.city=city;
	
	String counntryNames[]={"India","China","Pakisthana","Caneda","USA"};
	Country country=new Country(counntryNames,counntryNames[0]);
	country.state=state;
	
	
	country.getCountry();
	
	
	}


}