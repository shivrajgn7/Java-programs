class IccRunner{
	public static void main(String[] sports){
	String teams[]={"top1","top2","top3","top4","top5","top6","top7","top8","top9","top10"};

	Icc cricket=new Icc(teams,"India",63,true);
	//String teams[]={top1,top2,top3,top4,top5,top6,top7,top8,top9,top10};
	
	cricket.tops=teams;
	System.out.println(cricket.country+"  "+cricket.countryId+"  "+cricket.isCricket);
	cricket.getIcc();

	}
}