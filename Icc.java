class Icc{
	String tops[];
	String country;
	int countryId;
	boolean isCricket;
	
	Icc(String tops[],String country,int countryId,boolean isCricket){
	this.tops=tops;
	this.country=country;
	this.countryId=countryId;
	this.isCricket=isCricket;
	}
	void getIcc(){
		for (String jjj:tops)
			System.out.println(jjj);
		
	}



}