class PlayStation{

	int id;
	String name[];
	
	String color;
	String version;
	boolean isPS5;
	
	PlayStation(int id,String name[],String color,String version,boolean isPS5){
	this.id=id;
	this.name=name;
	this.color=color;
	this.version=version;
	this.isPS5=isPS5;
		
		
	}
	void getPlayStation(){
		for(String ply:name)
			System.out.println(ply);
	}
	



}