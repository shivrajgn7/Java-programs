class CgiRunner{
	public static void main(String [] login){
	
	System.out.println("Main started");
	boolean isRegisterd=Cgi.logIn("Shivraj","G","N",1234567890l,"psnps123","psnps123","PSNPS4545","Banglore",123456l);
	System.out.println("The user registered is: "+isRegisterd);
	
	if(isRegisterd)
	Cgi.getInfo();
	
	
	
	
	
	
	System.out.println("Main Ended");
	
	}
}