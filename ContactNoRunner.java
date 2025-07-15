class ContactNoRunner{
	static String name="Kavana";
	public static void main(String []gfg){

	System.out.println("Main Started");
	
	long no=ContactNo.callLog(name);
	System.out.println("The "+name+ " Contact number:"+no);
	
	System.out.println("Main Ended");
	
	}
}