class InstaLoginRunner{
	public static void main(String[] log){
	System.out.println("Main started");
	
	String email="Shiv@gmail.com";
	String userName="user@123";
	String password="pas768";
	boolean isValid=InstaLogin.isLog(email,userName,password);
	System.out.println("The "+email+" and "+userName+" and "+password+" is : "+isValid);
	
	long phno=9876544567l;
	boolean pValid=InstaLogin.isLog(phno,password);
	System.out.println("The "+phno+" and "+password+" is: "+pValid);
	
	
	System.out.println("Main Ended");
	}
}