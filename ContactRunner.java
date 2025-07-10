class ContactRunner{
	public static void main(String []save){
	
		boolean getResult=Contact.saveInfo("Shiv"," ",9545859l,"shhuh@gmail.com");
		System.out.println("Contact save"+getResult);
		
		Contact.getInfo();
	}
}