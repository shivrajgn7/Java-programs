class HotelRunner{
	public static void main(String [] taj){
	
	Room rooms=new Room();
	int roomNo=54;
	boolean isBalcony=true;
	rooms.roomNo=roomNo;
	rooms.isBalcony=isBalcony;
	
	
	
	Floor floor=new Floor();
	floor.rooms=rooms;
	
	
	Hotel hotel=new Hotel();
	String hotelName="Sai Ram";
	String hotelOwner="Veeresh";
	hotel.floor=floor;
	hotel.hotelName=hotelName;
	hotel.hotelOwner=hotelOwner;
	
	hotel.getHotel();
	
	
	
	
	
	
	}

}