class Baloon {
	int baloonId[];
	String color;
	String size;
	double cost;
	boolean isWorking;
	
	Baloon(int baloonId[],String color,String size,double cost,boolean isWorking){
		System.out.println("All parameter constructor is invoked");
		this.baloonId=baloonId;
		this.color=color;
		this.size=size;
		this.cost=cost;
		this.isWorking=isWorking;
		}
		
	Baloon(int baloonId[],String color,String size,double cost){
		System.out.println("Four  parameter constructor is invoked");
		this.baloonId=baloonId;
		this.color=color;
		this.size=size;
		this.cost=cost;
		this.isWorking=isWorking;
		}	

	
	Baloon(int baloonId[],String color,String size){
		System.out.println("Three parameter constructor is invoked");
		this.baloonId=baloonId;
		this.color=color;
		this.size=size;
		//this.cost=cost;
		//this.isWorking=isWorking;
		}
		
	Baloon(int baloonId[],String color){
		System.out.println("two parameter constructor is invoked");
		this.baloonId=baloonId;
		this.color=color;
		this.size=size;
		this.cost=cost;
		this.isWorking=isWorking;
		}
	Baloon(String color){
		System.out.println("Single parameter constructor is invoked");
		this.baloonId=baloonId;
		this.color=color;
		this.size=size;
		this.cost=cost;
		this.isWorking=isWorking;
		}
		
		
	Baloon(){
		System.out.println("Default parameter is printed");
	}
	
	void getBaloon(){
		System.out.println("Baloon id : "+baloonId);
		System.out.println("Baloon color: "+color);
		System.out.println("Size of the color: "+size);
		System.out.println("Cost of the color is: "+cost);
		System.out.println("Is working: "+isWorking);
		
		
	}
}