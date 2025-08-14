class HospitalRunner{

	public static void main(String[]health){
		System.out.println("Main started");
	Doctor doctor=new Doctor(34,"heart");
	
	Department department=new Department("surjon",doctor);
	//department.doctor=doctor;
	
	Hospital hospital=new Hospital(23,"RR","Neuro",department);
	hospital.department=department;
	hospital.getHospital();
	System.out.println("Main Ended");
	}

}