class Bucket{
	int bucketId[];
	String name;
	String color;
	String size;
	double price;
	boolean isGood;
	Bucket(){
		
		
	}
	Bucket(int bucketId[],String name){
		//this(34,34,34,43);
		this("White","Small");
		this.bucketId=bucketId;
		this.name=name;
		
		System.out.println("Two variable parameter: "+bucketId+"  "+name);
	}
	
	Bucket(String color,String size){
			this("dfdfb",250.84);
		this.color=color;
			this.size=size;
			System.out.println("Double variable parameter: "+color+ " "+size);
	}
	Bucket(String name,double price){
		
		this.name=name;
		this.price=price;
		System.out.println("Same String variable constructor invoked: "+name+ "  "+price);
	}
	void getBucket(){
		System.out.println("Bucket id is: "+bucketId);
		System.out.println("Bucket name: "+name);
		System.out.println("Bucket color: "+color);
		System.out.println("Bucket size: "+size);
		System.out.println("Price of the bucket: "+price);
		System.out.println("Bucket is good condition ?: "+isGood);
		
	}

}