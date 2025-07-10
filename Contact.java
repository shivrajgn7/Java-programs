class Contact{


	static String firstName;
	static String secName;
	static long phoneNo;
	static String gmail;

	public static boolean saveInfo(String fName,String sName,long pNo,String email){
		boolean getFname=false;
		boolean getSname=false;
		boolean getPnumber=false;
		boolean getGmail=false;
		boolean getResult=false;
		
		
		if(fName!=null){
			firstName=fName;
			getFname=true;
			}
			if(sName!=null){
				secName=sName;
				getSname=true;
				}
				if(pNo !=0&&pNo==10){
					phoneNo=pNo;
					getPnumber=true;
				} if (pNo!=10){
					System.out.println("write 10 digit number");
				}
					
				
				if(email !=gmail){
					gmail=email;
					getGmail=true;
				}
			if(getFname==true&&getSname==true&&getPnumber==true&&getGmail==true){
				getResult=true;
			}
				return getResult=true;
	}
	
	public static void getInfo(){
		System.out.println("First name: "+firstName);
		System.out.println("Secound name: "+secName);
		System.out.println("Phone Number: "+phoneNo);
		System.out.println("Gamil: "+gmail);
	
	}

}