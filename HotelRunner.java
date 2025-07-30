class HotelRunner{

	public static void main(String [] hotel){

	String menus[]={"Butter Chicken |"," Paneer Butter Masala |"," Chicken Curry |"," Mutton Rogan Josh |"," Kadai Paneer |"," Palak Paneer |"," Paneer Tikka Masala |"," Malai Kofta |"," Chole Masala |"," Rajma Curry |"," Mix Veg Curry |"," Veg Kolhapuri |"," Dal Tadka |"," Dal Makhani |"," Bhindi Masala |"," Aloo Gobi |"," Baingan Bharta |"," Fish Curry |"," Egg Curry |"," Prawns Masala |"," Chicken Biryani |"," Veg Biryani |"," Jeera Rice |"," Fried Rice |"," Schezwan Rice"};

		Hotel	food = new Hotel(menus,45,"Kimmane","RR area","Banglore");
		food.menu=menus;
		
		System.out.println(food.id+food.hotelName+food.area+food.city);
		for(String menu:menus)
		System.out.println(menu);


	}
}