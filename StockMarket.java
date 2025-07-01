class StockMarket{
	/*static String cmp1="yes Bank ";
	static String cmp2="IOCL ";
	static String cmp3="Relance ";
	static String cmp4="Infosis ";
	static String cmp5="jio ";
	static String cmp6="TATA steel ";
	static String cmp7="zomato ";
	static String cmp8="Rathan Indian power ";
	static String cmp9="suzlo Engery ";*/
	
	
	public static void main(String[]cmp){
		
		System.out.println("Main Started");
		
	String cmp1="yes Bank ";
	String cmp2="IOCL ";
	String cmp3="Relance ";
	String cmp4="Infosis ";
	String cmp5="jio ";
	String cmp6="TATA steel ";
	String cmp7="zomato ";
	String cmp8="Rathan Indian power ";
	String cmp9="suzlo Engery ";
		
		String stockName[]={cmp1,cmp2,cmp3,cmp4,cmp5,cmp6,cmp7,cmp8,cmp9};
		String cmpName[]={"yes Bank","IOCL","Relance"," Infosis","jio","TATA steel","zomato","Rathan Indian power","suzlo Engery"};
		//System.out.println("company name : " +cmpName[0]+ "  "+cmpName[1]+"  "+cmpName[2]+"  "+cmpName[3]+"  "+cmpName[4]+"  "+cmpName[5]+"  "+cmpName[6]+"  "+cmpName[7]+"  "+cmpName[8]);
		for(String company:stockName){
			System.out.println(company);
		}
	}
}
