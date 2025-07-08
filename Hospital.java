class Hospital{
	public static void add(String patientName,int age,String email,long phNo,String disease){
	System.out.println("Started with check up");
	Doctor.check(patientName,age,disease);
	System.out.println("Check up is done");
	
	}

}