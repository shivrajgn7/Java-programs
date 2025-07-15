class SwiggyRunner{
	static String name="Salad";
	static int qu=3;
	public static void main(String []delivery){
	System.out.println("The main is started");
		double price=Swiggy.food(name);
		System.out.println("The price of "+name+" is: "+price); 
		
		
		double priceVal =Swiggy.food(name,qu);
		System.out.println("The price of "+name+" with "+qu+"is: "+priceVal);
	System.out.println("The main is Ended");
	}
}