class  Market{
	public static boolean stock(String sName,boolean opNo ){
		
			if(sName !=null){
				System.out.println("The StockName was: "+sName);
			}
			else{
				System.out.println("give the stock name");
			}
			if(opNo==true){
				System.out.println("The market is open");
			}else{
				System.out.println("The market is closed");
			}
			return opNo;
			
		
	}
}