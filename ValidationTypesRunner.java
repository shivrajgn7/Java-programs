class ValidationTypesRunner{
	static String mn;
	static String ss;
	static char mm;
		static boolean mTrue;
	static boolean fTrue;
	static boolean isNum;
	
	public static void main(String[]val){
		
	boolean isName=ValidationTypes.fName(mn);
	System.out.println("Name is registered:"+isName);
	
	String secName=ValidationTypes.surName(ss);
	System.out.println("The Secound name was: "+secName);
	
	int pAge=ValidationTypes.isAge(14);
	System.out.println("The person age is : "+pAge);
	
	
	long isNo=ValidationTypes.isNumber(1234567890l);
	if(isNum){
	System.out.println("Phone no: "+isNo);
	}
	
	
	char isGen=ValidationTypes.isGender('m');
		if(mTrue==true||fTrue==true)
			System.out.println("The gender was : female : "+isGen);
		
	double amount=ValidationTypes.isAmount(0.00);
	System.out.println("Amount is:"+amount);
		
	}
	

}