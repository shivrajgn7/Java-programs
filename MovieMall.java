class MovieMall{
	public static void mall (String mName,String tName){
	System.out.println("Movie name was :" +mName);
	System.out.println("Thetar name :" +tName);
	String sTime="10:00";
	String eTime="1:00";
	MoviePvr.pvr(mName,sTime,eTime);
	}
}