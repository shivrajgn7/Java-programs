class Hotel{
	String hotelName;
	String hotelOwner;
	Floor floor;
	
	void getHotel(){
		this.floor.getFloor();
				System.out.println("Hotel details : ");

		System.out.println("Hotel Name: "+hotelName);
		System.out.println("Hotel owner: "+hotelOwner);
	}
}