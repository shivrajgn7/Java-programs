class Pipe{
	
	int pipeId;
	String brand;
	String type;
	double length;
	double diameter;
	double price;
	Pipe(int pipeId,String brand, String type,double length,double diameter,double price){
		this.pipeId=pipeId;
		this.brand=brand;
		this.type=type;
		this.length=length;
		this.diameter=diameter;
		this.price=price;
		
	}
	
	
	public void getInfo(){
	System.out.println("the pipe id is " +pipeId);
		System.out.println("the brand is " + brand);
		System.out.println("the type is " + type);
		System.out.println("the length is " + length);
		System.out.println("the diameter is " +diameter);
		System.out.println("the price is " + price);
	}
}