class FacebookRunner{

	public static void main(String[] socialmedia){
		boolean isUserRegisterd=Facebook.login("shshhs","eeeee",786676767l);
		if(isUserRegisterd){
		Facebook.getInfo();
		System.out.println("Registered success");
		}
		else
			System.out.println("incopleted");
	
	
	}

}