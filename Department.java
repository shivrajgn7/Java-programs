class Department{

	String departmentName;
	Doctor doctor;
	Department(String departmentName,Doctor doctor){
		
		this.departmentName=departmentName;
		this.doctor=doctor;
	}
	void getDepartment(){
	System.out.println("Department name is : "+departmentName);
	this.doctor.getDoctor();
	
	
	}


}