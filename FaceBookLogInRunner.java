class FaceBookLogInRunner{
	public static void main(String[]log){
		System.out.println("Main Started");
		
		String email="Baba@gmail.com";
		String password="baba435@12";
		boolean isLogin=FaceBookLogIn.logIn(email,password);
		System.out.println("Your "+email+" & "+password+" is : "+isLogin);
		
		long phNo=0;
		boolean isLoged=FaceBookLogIn.logIn(phNo,password);
		System.out.println("Your "+phNo+" & "+password+" is: "+isLoged);
		
		
		
		System.out.println("Main Ended");
	
	}
}