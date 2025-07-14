class GameingPc{
	public static String pc (String pcName,boolean motherBoard,boolean cooler,boolean graphicCard){
		if(pcName!=null){
			if(motherBoard==true){
				if(cooler==true){
					if(graphicCard==true){
					System.out.println("The pc name: "+pcName);
					System.out.println("this have motherBoard");
					System.out.println("This have cooler");
					System.out.println("This have graphicCard");
					}
				}
			}
		}else{
		System.out.println("please fix all parts");
		}
		return pcName;
	}
}