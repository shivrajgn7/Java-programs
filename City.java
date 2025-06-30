class City{
	static String pincode[]={"Mumbai – 400001, " , " Delhi – 110001, " , " Bengaluru – 560001, " , " Chennai – 600001, " , " Kolkata – 700001, " , " Hyderabad – 500001, " , " Pune – 411001, " , " Ahmedabad – 380001, " , " Jaipur – 302001, " , " Lucknow – 226001"};

	public static void main(String[]pin){
		//System.out.println("About PinCode : " +pincode[0]+ "  "+pincode[1]+ "  "+pincode[2]+ "  "+pincode[3]+ "  "+pincode[4]+ "  "+pincode[5]+ "  "+pincode[6]+ "  "+pincode[7]+ "  "+pincode[8]+ "  "+pincode[9]);
		for(String ppin:pincode){
			System.out.println(ppin);
		}
	}
}	