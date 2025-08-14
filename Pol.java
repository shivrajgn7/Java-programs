class Pol{
	
	
	
	Pol(){
		System.out.println("Constructor is invoked");
		
	}
	Pol(int politicianId,String name, String party,String position,int age){
		System.out.println("Politician parameter constuctor is invoked");
		this.politicianId=politicianId;
		
	}
	
	int politicianId;
	String name;
	String party;
	String position;
	int age;
	
	
	
	public void getInfo(){
		System.out.println("the politician id is " +politicianId);
		System.out.println("the name is " + name);
		System.out.println("the party is " + party);
		System.out.println("the position is " +position);
		System.out.println("the age is " + age);
		
	}
	
}