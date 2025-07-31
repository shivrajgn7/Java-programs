class Egg{
	int eggId;
	String color;
	int calories;
	float fat;
	int protin;
	boolean isGood;
	
	Egg(){
	this(45);	
	System.out.println("Default constructor");
	
	}
	
	
	Egg(int eggId){
		this(65,"White");
		this.eggId=eggId;
		System.out.println("Single variable parameter constructor: "+eggId);
		
	}
	
	Egg(int eggId,String color){
	this(65,"Yello",50);
	this.eggId=eggId;
	this.color=color;
	System.out.println("Two variable parameter constructor:"+eggId+" color: "+color);
		
	}
	
	Egg (int eggId,String color,int calories){
		this(53,"White",15,5);
	this.eggId=eggId;
	this.color=color;
	this.calories=calories;
	System.out.println("Three variable parameter constructor:"+"Id: "+eggId+" color: "+color+" calories: "+calories);
		
	}
	
	Egg(int eggId,String color,int calories, float fat){
	this(542,"White",22,6,75);
	this.eggId=eggId;
	this.color=color;
	this.calories=calories;	
	this.fat=fat;
	System.out.println("Four variable parameter constructor"+eggId+" "+color+" "+calories+" "+fat);	
	
	}
	
	Egg( int eggId,String color,int calories, float fat,int protin){
		this(654,"Yello",45,7,32,true);
		this.eggId=eggId;
	this.color=color;
	this.calories=calories;	
	this.fat=fat;
	this.protin=protin;
		System.out.println("Five variable parameter constructor: "+eggId+" "+color+" "+calories+" "+fat+ " "+protin);
		
	}
	
	Egg(int eggId,String color,int calories, float fat,int protin,boolean isGood){
		
	this.eggId=eggId;
	this.color=color;
	this.calories=calories;	
	this.fat=fat;
	this.protin=protin;
	this.isGood=isGood;
		System.out.println("Six variable parameter constructor: "+eggId+" "+color+" "+calories+" "+fat+ " "+protin+" "+isGood);
		
	}
		
	
	
	
	
	

	void getEgg(){
		
	System.out.println("Egg id is: "+eggId);
	System.out.println("Egg color is: "+color);
	System.out.println("Egg calories is: "+calories);
	System.out.println("Egg fat is: "+fat);
	System.out.println("Egg Protin is: "+protin);
	System.out.println("Egg is good? : "+isGood);
	}

}