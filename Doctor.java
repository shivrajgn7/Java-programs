class Doctor{
	int doctorId;
	String specialist;
	Doctor(int doctorId,String specialist){
		this.doctorId=doctorId;
		this.specialist=specialist;
	}
	
	void getDoctor(){
	System.out.println("Doctor id is : "+doctorId);
	System.out.println("Sepecialist in : "+specialist);
	
	}



}