class Hospital{
	int hospitalId;
	String hospitalName;
	String departmentName;
	
	Department department;
	Hospital(	int hospitalId,String hospitalName,String departmentName,Department department){
		
		this.hospitalId=hospitalId;
		this.hospitalName=hospitalName;
		this.departmentName=departmentName;
		this.department=department;
	}
	void getHospital(){
	
	System.out.println("Printing Hospital details: ");
	System.out.println("Hospital id : "+hospitalId);
	System.out.println("Hospital name : "+hospitalName);
	System.out.println("Department name: "+departmentName);
	this.department.getDepartment();
	
	}
	


}