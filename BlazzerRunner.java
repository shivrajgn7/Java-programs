class BlazzerRunner{

	public static void main(String [] cloths){
	
			Blazzer		cloth1 =new Blazzer();
			cloth1.blazzerId=43;
			cloth1. company="LV";
			cloth1.quality="Good";
			cloth1.amount=4004.00;
			cloth1.clothType="Cotton";
		System.out.println("Blazzer id: "+cloth1.blazzerId);
		System.out.println("Company name: "+cloth1.company);
		System.out.println("Cloth quality: "+cloth1.quality);
		System.out.println("Amount: "+cloth1.amount);
		System.out.println("Cloth type: "+cloth1.clothType);
		
	
	Blazzer		cloth2 =new Blazzer();
			cloth2.blazzerId=765;
		cloth2. company="HTM";
		cloth2.quality="Good";
			cloth2.amount=6542.00;
			cloth2.clothType="Nylon";
			
			
		System.out.println("Blazzer id: "+cloth2.blazzerId);
		System.out.println("Company name: "+cloth2.company);
		System.out.println("Cloth quality: "+cloth2.quality);
		System.out.println("Amount: "+cloth2.amount);
		System.out.println("Cloth type: "+cloth2.clothType);
	}

}