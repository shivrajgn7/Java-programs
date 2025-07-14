class ValidationTypes{

	static String firstName;
	static String  secName;
	static long isNo;

	//returning boolean value
	public static boolean fName(String name){
		boolean isname=false;
		if(name!= null){
		firstName=name;
		isname=true;
		}else{
		System.out.println("Have to give character");
		}
		return isname;
		
}

	//returning String value
	public static String surName(String sName){
		
		boolean isSurName=false;
		if(sName != null){
			secName=sName;
			isSurName=true;
			
		}else{
			System.out.println("give correct character");
		
	}
	return secName;
	}
	
	//returning int value
	public static int isAge(int age){
		int pAge=0;
		boolean ageValid=false;
		if(age!=0&&age<90&& age > 18){
			pAge=age;
			ageValid=true;
		}
		else{
			System.out.println("The person age shold be allowed above 18 & below 90 : ");
		}
		return pAge;
	}
	
	//returning long value
	public static long isNumber(long num){
		if(num != 0 && num ==10){
			boolean isNum=true;
			isNo=num;
	}
		else{
			System.out.println(" Enter your 10 digit phxone number");
		}
	
	return isNo;
	}
	
	//returning char value
	public static char isGender(char gender){
		char isGen='\0';
		if(gender=='M'|| gender=='m') {
			boolean mTrue=true;
			System.out.println("The gender  was : Male"  );
		}
			
		if(gender=='F'||gender=='f'){
			boolean fTrue=true;
			System.out.println("The gender  was : Female"  );
			isGen=gender;
		}
		else{
			System.out.println("You should give sigle char Male for 'M or m' or Female for 'F or f' ");
			
		}
		return isGen;
		
	}
	
	//returning double value
	public static double isAmount(double amt){
	double amount=0.00;
		if(amt!=0.00){
			if(amt >0.00){
				amount=amt;
			System.out.println("Amount is allowed");
			}
	}
			else{
				System.out.println("Amount should be greater than zero");
			}
		return amount;
		
		
	}
	
}