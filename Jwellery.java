class Jwellery{
	
	int jwelleryId;
	String type;
	String metal;
	double weight;
	double price;
	String design;
	Jwellery(int jwelleryId,String type,String metal,double weight,double price,String design){
		this.jwelleryId=jwelleryId;
		this.type=type;
		this.metal=metal;
		this.weight=weight;
		this.price=price;
		this.design=design;
		
	}
	
	
	public void getInfo(){
		
		System.out.println("the jwellery id is " + jwelleryId);
		System.out.println("the type is " + type);
		System.out.println("the metal is " + metal);
		System.out.println("the weight is " + weight);
		System.out.println("the price is " + price);
		System.out.println("the design is " +design);

		
		
	}
	
	
	
	}