class Weapon{
	int wepId;
	String wepCompany;
	String wepName;
	String wepColor;
	boolean isFire;
	int noBulets;
	Weapon(int wepId,String wepCompany,String wepName,String wepColor,boolean isFire){
		System.out.println("Constructor is invoked");
	this.wepId=wepId;
	this.wepName=wepName;
	this.wepColor=wepColor;
	this.isFire=isFire;
	this.wepCompany=wepCompany;
		
	}

	public  void getInfo(){
	System.out.println("Weapon Id is: "+wepName);
	System.out.println("Weapon company: "+wepCompany);
	System.out.println("Weapon name: "+wepName);
	System.out.println("Weapon color: "+wepColor);
	System.out.println("Is working: "+isFire);
	System.out.println("No of bullets"+noBulets);
	
	}
}