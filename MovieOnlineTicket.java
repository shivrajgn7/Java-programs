class MovieOnlineTicket{
	public static void bookMyShow(String state,String district,String mName,String tName){
		System.out.println("Started to buy movie ticket");
		double amount=300.00;
		MoviePayment.pay(mName,tName,amount);
	}
}