class FaceBookLogIn{
	public static boolean logIn(String email,String password){
		boolean isLogin=false;
		if(email!=null)
			System.out.println("The email was: "+email);
		if(password!=null){
			System.out.println("The Password is: "+password);
			
			isLogin=true;
	}
		else
			System.out.println("give email and password");
			return isLogin;
		}
		
		public static boolean logIn(long phNo,String password){
		boolean isLoged=false;
		if(phNo!=0){
			System.out.println("The email was: "+phNo);
		if(password!=null){
			System.out.println("The Password is: "+password);
			
			isLoged=true;
		}
		}
		else
			System.out.println("give email and password");
		return isLoged;
		}
}
			
			
	