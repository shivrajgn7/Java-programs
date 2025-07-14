class Cgi{
static String name;
static String password;
static String panNo;
static String cityName;
static long pinNo;
static long calId;
public static boolean logIn(String fName,String mName,String lName,long pNo,String psw,String cPsw,String pan,String city,long pin){

	boolean nameVal=false;
	boolean phValid=false;
	boolean pasValid=false;
	boolean panValid=false;
	boolean cityValid=false;
	boolean pinValid=false;
	boolean isRegisterd=false;

	if(fName!=null&&lName!=null){
		nameVal=true;
		name=fName+lName;
		}
		if(pNo==10l){
			phValid=true;
			calId=pNo;
			}
			if(psw!=null&&cPsw!=null){
				if(psw==cPsw){
					
					pasValid=true;
					password=psw;
				}
			}
				if(pan!=null){
				panValid=true;
				panNo=pan;
			
				}
					if(city!=null){
						cityValid=true;
						cityName=city;
					}
					if(pin==6l){
					pinValid=true;
					pinNo=pin;
					}
			else{
			System.out.println("please fill all the box");
			}
		if(nameVal&&pasValid&&panValid&&cityValid){
		isRegisterd=true;
		}
		return isRegisterd;
}

		
		public static void getInfo(){
		System.out.println("The name was: "+name);
		System.out.println("phone number: "+calId);
		System.out.println("The password is: "+password);
		System.out.println("City name is : "+cityName);
		System.out.println("Pan number: "+panNo);
		System.out.println("city PIN code: "+pinNo);
		}
	}
	
	