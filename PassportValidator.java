class PassportValidator{
static String givenName ;
	 static String surName ; 
	 static String password;
	 static String cPassword;
	public static boolean pasValid(String gName , String sName, String pwd ,String cPwd){
							boolean isValid=false;
							boolean givenNameValid = false;
						    boolean surNameValid  = false;
							boolean pasValid=false;
							boolean cpas=false;
							boolean cValid=false;
		  if( gName != null){
			  givenNameValid = true ;
			  
			  givenName     =   gName  ; 
			     
			       
		  }	
			
			if(sName != null){
				surNameValid = true ; 
				surName 	= sName;
				 
			}

			if(pwd!=null){
				
				pasValid=true;
				password=pwd;
			}
			
			if(cPwd!=null&&cPwd.equals(pwd)){
				cValid=true;
				cPassword=cPwd;
			}
			
			if(	 givenNameValid&& surNameValid&&pasValid&&cValid){
				isValid  = true;
			}
			return isValid;
		}
}
	