class CityRunner{
	public static void main(String[]streets){
	
	String street1[]={"MG road","RR nagar","Malleshwaram","Magdi"};
	
		City ref1=new City("dfd23","Banglore","Karnataka",street1);
				ref1.street2=street1;

		ref1.getCity();
		//System.out.println(ref1.cityId+" "+ref1.cityName+" "+ref1.state+" "+ref1.street1);
	
	}



}