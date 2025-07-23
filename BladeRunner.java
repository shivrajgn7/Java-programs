class BladeRunner{

	public static void main(String[]cutter){
	
				Blade type1=new Blade();
				
	type1.bladeId=54;
	type1.bladeCompany="XML";
	type1.type="Steel";
	type1. isRustFree=true;
	type1.size="rectangle";
	
		System.out.println("Blade id: "+type1.bladeId);
		System.out.println("Blade company: "+type1.bladeCompany);
		System.out.println("Type: "+type1.type);
		System.out.println("Is this rust free: "+type1.isRustFree);
		System.out.println("blade size: "+type1.size);
		
		
		
		
	Blade type2=new Blade();
	type2.bladeId=654;
	type2.bladeCompany="xamp";
	type2.type="Steel";
	type2. isRustFree=false;
	type2.size="rectangle";
	
		System.out.println("Blade id: "+type2.bladeId);
		System.out.println("Blade company: "+type2.bladeCompany);
		System.out.println("Type: "+type2.type);
		System.out.println("Is this rust free: "+type2.isRustFree);
		System.out.println("blade size: "+type2.size);
	
	}

}