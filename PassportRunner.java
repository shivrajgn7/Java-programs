class PassportSevaRunner {
	  static String ffName="shiv";
	  static String ssName;

     public static void main(String seva[]){
	    
		boolean userIsRegistered =   PassportSeva.registerUser(ffName,ssName);
	     System.out.println("Is USer Registered "+ userIsRegistered);
		 
		 
		      PassportSeva.getUserInfo();
	}


}