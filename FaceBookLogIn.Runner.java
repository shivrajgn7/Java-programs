class FaceBookLogInRunner{
	public static void main(String[]log){
		System.out.println("Main Started");
		
		String email="Baba@gmail.com";
		String password="baba435@12";
		boolean isLogin=FaceBookLogIn.logIn(email,password);
		System.out.println("Your "+email+" & "+password+" is : "+isLogin); 
		
		
		System.out.println("Main Ended");
	
	}
}