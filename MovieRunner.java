class MovieRunner{
	public static void main(String[]cine){
		System.out.println("Main Started");
		
		String state="Karnataka";
		String district="Banglore";
		String mName="KGF";
		String tName="PVR";
		
		
		MovieOnlineTicket.bookMyShow( state,district, mName, tName);
		
		
		
		System.out.println("Main Ended");
	
	}
}