class XloginRunner{
	public static void main(String[]log){
		System.out.println("Main Started");
		
		String email="vfnf@gmail.com";
		String password="bbdv435@12";
		boolean isLogin=Xlogin.logIn(email,password);
		System.out.println("Your "+email+" & "+password+" is : "+isLogin);
		
		long phNo=0;
		boolean isLoged=Xlogin.logIn(phNo,password);
		System.out.println("Your "+phNo+" & "+password+" is: "+isLoged);
		
		
		
		System.out.println("Main Ended");
	
	}
}