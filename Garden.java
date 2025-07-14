class Garden{
	public static  String park(String gName,boolean opNot,boolean security){
		if(gName!=null){
			if(opNot==true){
				if(security==true){
				
				System.out.println("The garden name is: "+gName);
				System.out.println("The garden is open: "+opNot);
				System.out.println("With all Security: "+security);
				}
			}
		}else{
		System.out.println("please mention all button");
		}
		return gName;
	
	}
}