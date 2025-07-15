class InstaLogin{
	public static boolean isLog(String email,String userName,String password)
	{
		boolean isValid=false;
		
		if(email!=null){
			System.out.println("The email was: "+email);
			if(userName!=null)
				System.out.println("The userName is: "+userName);
				if(password!=null)
					System.out.println("The Password is: "+password);
					isValid=true;
		}else{
		System.out.println("please fill the Box");
		}
		return isValid;
	
	}
	public static boolean isLog(long phNo ,String password)
	{
		boolean pValid=false;
		if(phNo!=0){
			System.out.println("The phone number is: "+phNo);
			if(password!=null)
				System.out.println("The password is: "+password);
				pValid=true;
		}
		else{
			System.out.println("Fill the box");
		}
		return pValid;
	}
}