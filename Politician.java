class Politician{
	int politicianId;
	String name;
	String party;
	String position;
	int age;
	Politician(int politicianId,String name, String party,String position,int age){
		this.politicianId=politicianId;
		this.name=name;
		this.party=party;
		this.position=position;
		this.age=age;
		
		
	}
	
	public void getInfo(){
		System.out.println("the politician id is " +politicianId);
		System.out.println("the name is " + name);
		System.out.println("the party is " + party);
		System.out.println("the position is " +position);
		System.out.println("the age is " + age);
		
	}
	
}