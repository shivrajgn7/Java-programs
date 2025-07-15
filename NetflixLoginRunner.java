class NetflixLoginRunner{
	public static void main(String[]log){
		System.out.println("Main Started");
		
		String email="sam@gmail.com";
		String password="sam987";
		boolean isLogin=NetflixLogin.logIn(email,password);
		System.out.println("Your "+email+" & "+password+" is : "+isLogin);
		
		long phNo=67899876l;
		boolean isLoged=NetflixLogin.logIn(phNo,password);
		System.out.println("Your "+phNo+" & "+password+" is: "+isLoged);
		
		
		System.out.println("Main Ended");
	
	}
}