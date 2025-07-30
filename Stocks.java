class Stocks{

	int stockId;
	String company[];
	String market;
	boolean isEquity;
	String country;

		Stocks(int stockId,String company[],String market,boolean isEquity,String country){
			this.stockId=stockId;
			this.company=company;
			this.market=market;
			this.country=country;
			
		}
		void getStocks(){
			for(String mm:company)
				System.out.println(mm);
		}


}