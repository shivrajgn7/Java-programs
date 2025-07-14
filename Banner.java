class Banner{
	public static String comp(String name,String title,boolean pic){
		if(name!=null){
			System.out.println("The banner name: "+name);
			}
		if(title!=null){
			System.out.println("The bannner title: "+title);
			}
			if(pic==false){
			System.out.println("The picture was not found");
			}
			else
			System.out.println("The picture is found");
			
			return name;
	}
}