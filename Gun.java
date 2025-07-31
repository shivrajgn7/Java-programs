class Gun{
	int gunId;
	String gunName;
	String color;
	int noAmmo;
	boolean isWorking;
	
	Gun(int gunId,String gunName,String color){
	this(76,true);
	this.color=color;
	System.out.println(" 1  constructor chaining: "+gunId+ " "+color+ " "+gunName);
	}
	
	
	Gun(int gunId){
		this(23,"AK47","Brown");
		this.gunId=gunId;
		System.out.println("Starting point of Constructor chaining: "+gunId);
		
	}
	
	Gun(int noAmmo,boolean isWorking){
		
		System.out.println(" 2 constructor chaining: "+noAmmo+" "+isWorking);
	}
	
	void getGun(){
		System.out.println("Gun id is: "+gunId);
		System.out.println("Gun name: "+gunName);
		System.out.println("Gun color is : "+color);
		System.out.println("number of ammos: "+noAmmo);
		System.out.println("Gun is in working condition?: "+isWorking);
		
	}
}