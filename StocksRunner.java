class StocksRunner{
	public static void main(String[] economy){
	
	String cmpName[]={"yes Bank","IOCL","Relance"," Infosis","jio","TATA steel","zomato","Rathan Indian power","suzlo Engery"};

	Stocks cmp=new Stocks(45,cmpName,"India",true,"India");
	cmp.company=cmpName;
	System.out.println(cmp.stockId+cmp.market+cmp.isEquity+cmp.country);
	
		cmp.getStocks();
	
	
	}
}