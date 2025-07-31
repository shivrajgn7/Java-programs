class BaloonRunner{
	public static void main(String [] air){
	
	int id[]={34,36,23,53,23};
	Baloon dec=new Baloon(id,"Red","Small");
		dec.getBaloon();

	
	Baloon dec1=new Baloon(id,"blue","big",54.00);
		dec1.getBaloon();

	Baloon dec2=new Baloon(id,"white");
		dec2.getBaloon();
   
		Baloon dec3=new Baloon(id,"blue","big",54.00,true);

	
	
	dec3.getBaloon();
	Baloon dec4=new Baloon();
	dec4.getBaloon();
	
		Baloon dec5=new Baloon("white");
		dec5.getBaloon();

	
	
	
	
	
	
	
	}
	
}