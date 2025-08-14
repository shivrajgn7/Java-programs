class Company{
	String cmpName;
	//Manager manager;
	//Employe employe;
	
	Company(String cmpName, Manager manager){
		this.cmpName=cmpName;
		this.manager=manager;
	}
	//Employe employe1=new Employe(56);
	
	void getCompany(){
		System.out.println("Company name: "+cmpName);
		manager.getManager();
	    //Employe employe=new Employe(45);
		//employe1.getEmploye();
		
	}

}