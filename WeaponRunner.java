class WeaponRunner{
	public static void main(String[]fire){
	
	Weapon gun=new Weapon();
	gun.wepId=454;
	gun.wepCompany="NNBBV";
	gun. wepName="AK47";
	gun. wepColor="Brown & Black";
	gun.isFire=true;
	gun. noBulets=37;
	
	System.out.println("Weapon Id is: "+gun.wepName);
	System.out.println("Weapon company: "+gun.wepCompany);
	System.out.println("Weapon name: "+gun.wepName);
	System.out.println("Weapon color: "+gun.wepColor);
	System.out.println("Is working: "+gun.isFire);
	System.out.println("No of bullets"+gun.noBulets);



	Weapon gun1=new Weapon();
	gun1.wepId=65;
	gun1.wepCompany="NNBBV";
	gun1. wepName="M416";
	gun1. wepColor=" Black";
	gun1.isFire=true;
	gun1. noBulets=40;
	
	System.out.println("Weapon Id is: "+gun1.wepName);
	System.out.println("Weapon company: "+gun1.wepCompany);
	System.out.println("Weapon name: "+gun1.wepName);
	System.out.println("Weapon color: "+gun1.wepColor);
	System.out.println("Is working: "+gun1.isFire);
	System.out.println("No of bullets"+gun1.noBulets);
	
	
	}


}