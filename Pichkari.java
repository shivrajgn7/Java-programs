class Pichkari{
	int id;
	String capacity;
	String color;
	String rang;
	boolean isWorking;
	double price;
	
	Pichkari(int id,String capacity,String color,String rang,boolean isWorking,double price){
		this.id=id;
		this.capacity=capacity;
		this.color=color;
		this.rang=rang;
		this.isWorking=isWorking;
		this.price=price;
		}
		
		Pichkari(int id,String capacity,String color,String rang,boolean isWorking){
		this.id=id;
		this.capacity=capacity;
		this.color=color;
		this.rang=rang;
		this.isWorking=isWorking;
		this.price=price;
		}
		Pichkari(int id){
			this(43,"50ml","Blue");
			this.id=id;
			System.out.println("single parameter constructor");
		}
		Pichkari(){
			this( 45);
			System.out.println("Default constructor");
		}
		Pichkari(int id,String capacity,String color,String rang){
			this.id=id;
			this.capacity=capacity;
			this.rang=rang;
			this.color=color;
			System.out.println("Four parameter variable");
			getPichkari();
		}
		
	Pichkari(int id,String capacity,String color){
		this(76,"10ml","Black","10meter");
		System.out.println("Three parameter variable");
		this.id=id;
		this.capacity=capacity;
		this.color=color;
	}
	

	void getPichkari(){
		System.out.println("this pichkari is: "+id);
		System.out.println("This color capacity: "+capacity);
		System.out.println("This is colour : "+color);
		System.out.println("This is range: "+rang);
		System.out.println("boolean is working: "+isWorking);
		System.out.println("price of pichkari: "+price);
	}
}