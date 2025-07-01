class City{
	
	/*static String pin1="Mumbai – 400001, ";
	static String pin2="Delhi – 110001, ";
	static String pin3="Bengaluru – 560001, ";
	static String pin4="Chennai – 600001, ";
	static String pin5="Kolkata – 700001, ";
	static String pin6="Hyderabad – 500001, ";
	static String pin7="Pune – 411001, ";
	static String pin8="Ahmedabad – 380001,  ";
	static String pin9="Jaipur – 302001,  ";
	static String pin10="Lucknow – 226001 ";*/
	//static String  pinNum[]={pin1,pin2,pin3,pin4,pin5,pin6,pin7,pin8,pin9,pin10};
	static String pincode[]={"Mumbai – 400001, " , " Delhi – 110001, " , " Bengaluru – 560001, " , " Chennai – 600001, " , " Kolkata – 700001, " , " Hyderabad – 500001, " , " Pune – 411001, " , " Ahmedabad – 380001, " , " Jaipur – 302001, " , " Lucknow – 226001"};

	public static void main(String[]pin){
	System.out.println("Main Started");
	 String pin1="Mumbai – 400001, ";
	 String pin2="Delhi – 110001, ";
	 String pin3="Bengaluru – 560001, ";
	 String pin4="Chennai – 600001, ";
	 String pin5="Kolkata – 700001, ";
	 String pin6="Hyderabad – 500001, ";
	 String pin7="Pune – 411001, ";
	 String pin8="Ahmedabad – 380001,  ";
	 String pin9="Jaipur – 302001,  ";
	 String pin10="Lucknow – 226001 ";
	 
	 	String  pinNum[]={pin1,pin2,pin3,pin4,pin5,pin6,pin7,pin8,pin9,pin10};

		//System.out.println("About PinCode : " +pincode[0]+ "  "+pincode[1]+ "  "+pincode[2]+ "  "+pincode[3]+ "  "+pincode[4]+ "  "+pincode[5]+ "  "+pincode[6]+ "  "+pincode[7]+ "  "+pincode[8]+ "  "+pincode[9]);
		for(String ppin:pinNum){
			System.out.println(ppin);
		}
	}
}	