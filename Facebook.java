class Facebook{
	static String firstName;
	static String secName;
	static long mobileNo;
	
	public static boolean login(String fName,String sName,long mobNo){
		boolean getName=false;
		boolean getSecName=false;
		boolean getNumber=false;
		boolean isUserRegisterd=false;
		
	if(fName!=null){
		firstName=fName;
		getName=true;
		}
		
		if(sName!=null){
			secName=sName;
			getSecName=true;
			}
			
			if (mobNo==10){
				mobileNo=mobNo;
				getNumber=true;
				}
				
				if(getName==true&&getSecName==true&&getNumber==true)
					isUserRegisterd=true;
			return isUserRegisterd;
			
				
	}
	public static void getInfo(){
		
		System.out.println("The first name: "+firstName);
		System.out.println("The Secound name: "+secName);
		System.out.println("Mobile no: "+mobileNo);
		
		
	}



}