class JwelleryRunner {


	public static void main(String[] jwellery) {

		Jwellery ref1 = new Jwellery(1,"Necklace","Gold",15.0,75000.0,"Taditional");
		/*ref1.jwelleryId = 1;
		ref1.type = "Necklace";
		ref1.metal = "Gold";
		ref1.weight = 15.0;
		ref1.price = 75000.0;
		ref1.design = "Traditional";*/
		
		ref1.getInfo();
		
		Jwellery ref2 = new Jwellery(2,"Ring","Silver",5.0,3000.0,"Modern");
	/*	ref2.jwelleryId = 2;
		ref2.type = "Ring";
		ref2.metal = "Silver";
		ref2.weight = 5.0;
		ref2.price = 3000.0;
		ref2.design = "Modern";*/
		ref2.getInfo();
		

		Jwellery ref3 = new Jwellery(3,"Earrings","Platinum",7.5,25000.0,"Contemporary");
		/*ref3.jwelleryId = 3;
		ref3.type = "Earrings";
		ref3.metal = "Platinum";
		ref3.weight = 7.5;
		ref3.price = 25000.0;
		ref3.design = "Contemporary";*/
ref3.getInfo();

		Jwellery ref4 = new Jwellery(4,"Bracelet","Gold",10.0,48000,"Simple");
		/*ref4.jwelleryId = 4;
		ref4.type = "Bracelet";
		ref4.metal = "Gold";
		ref4.weight = 10.0;
		ref4.price = 48000.0;
		ref4.design = "Simple";*/
	
ref4.getInfo();	
	
	
		Jwellery ref5 = new Jwellery(5,"Bangales","Silver",12.0,60000.0,"Antique");
		/*ref5.jwelleryId = 5;
		ref5.type = "Bangles";
		ref5.metal = "Silver";
		ref5.weight = 12.0;
		ref5.price = 6000.0;
		ref5.design = "Antique";*/
	ref5.getInfo();
		
		Jwellery ref6 = new Jwellery(6,"Pendant","Gold",6.0,26000.0,"Stylesh");
		/*ref6.jwelleryId = 6;
		ref6.type = "Pendant";
		ref6.metal = "Gold";
		ref6.weight = 6.0;
		ref6.price = 27000.0;
		ref6.design = "Stylish";*/
ref6.getInfo();

		Jwellery ref7 = new Jwellery(7,"Nose pin","Platinum",1.2,8000.0,"Tiny");
		/*ref7.jwelleryId = 7;
		ref7.type = "Nose Pin";
		ref7.metal = "Platinum";
		ref7.weight = 1.2;
		ref7.price = 8000.0;
		ref7.design = "Tiny";*/
ref7.getInfo();
		Jwellery ref8 = new Jwellery(8,"Anklet","Silver",8.0,42000.0,"Ethnic");
		/*ref8.jwelleryId = 8;
		ref8.type = "Anklet";
		ref8.metal = "Silver";
		ref8.weight = 8.0;
		ref8.price = 4500.0;
		ref8.design = "Ethnic";*/
	ref8.getInfo();

		Jwellery ref9 = new Jwellery(9,"Mangalsuthra","Gold",20.0,95000.0,"Traditioal");
		/*ref9.jwelleryId = 9;
		ref9.type = "Mangalsutra";
		ref9.metal = "Gold";
		ref9.weight = 20.0;
		ref9.price = 95000.0;
		ref9.design = "Traditional";*/
ref9.getInfo();

		Jwellery ref10 = new Jwellery(10,"Choker","Platinum",13.5,11000.0,"Designer");
		/*ref10.jwelleryId = 10;
		ref10.type = "Choker";
		ref10.metal = "Platinum";
		ref10.weight = 13.5;
		ref10.price = 110000.0;
		ref10.design = "Designer";*/
ref10.getInfo();
		
		/*		Jwellery ref11 = new Jwellery();
		ref11.jwelleryId = 11;
		ref11.type = "Toe Ring";
		ref11.metal = "Silver";
		ref11.weight = 2.5;
		ref11.price = 1200.0;
		ref11.design = "Simple";
		ref11.getInfo();
		
		Jwellery ref12 = new Jwellery();
		ref12.jwelleryId = 12;
		ref12.type = "Brooch";
		ref12.metal = "Gold";
		ref12.weight = 4.0;
		ref12.price = 20000.0;
		ref12.design = "Floral";
ref12.getInfo();

		Jwellery ref13 = new Jwellery();
		ref13.jwelleryId = 13;
		ref13.type = "Hairpin";
		ref13.metal = "Silver";
		ref13.weight = 3.2;
		ref13.price = 1800.0;
		ref13.design = "Ornamental";
	ref13.getInfo();
		
		Jwellery ref14 = new Jwellery();
		ref14.jwelleryId = 14;
		ref14.type = "Waist Chain";
		ref14.metal = "Gold";
		ref14.weight = 25.0;
		ref14.price = 112000.0;
		ref14.design = "Traditional";
	ref14.getInfo();

		Jwellery ref15 = new Jwellery();
		ref15.jwelleryId = 15;
		ref15.type = "Cufflinks";
		ref15.metal = "Platinum";
		ref15.weight = 6.0;
		ref15.price = 35000.0;
		ref15.design = "Classic";
	ref15.getInfo();
	
		Jwellery ref16 = new Jwellery();
		ref16.jwelleryId = 16;
		ref16.type = "Armlet";
		ref16.metal = "Gold";
		ref16.weight = 18.0;
		ref16.price = 78000.0;
		ref16.design = "Temple";
	ref16.getInfo();

		Jwellery ref17 = new Jwellery();
		ref17.jwelleryId = 17;
		ref17.type = "Hair Band";
		ref17.metal = "Silver";
		ref17.weight = 3.5;
		ref17.price = 1900.0;
		ref17.design = "Trendy";
ref17.getInfo();

		Jwellery ref18 = new Jwellery();
		ref18.jwelleryId = 18;
		ref18.type = "Locket";
		ref18.metal = "Gold";
		ref18.weight = 5.5;
		ref18.price = 24000.0;
		ref18.design = "Minimal";
	ref18.getInfo();

		Jwellery ref19 = new Jwellery();
		ref19.jwelleryId = 19;
		ref19.type = "Stud";
		ref19.metal = "Platinum";
		ref19.weight = 2.0;
		ref19.price = 9000.0;
		ref19.design = "Small";
		ref19.getInfo();

		Jwellery ref20 = new Jwellery();
		ref20.jwelleryId = 20;
		ref20.type = "Chain";
		ref20.metal = "Gold";
		ref20.weight = 14.0;
		ref20.price = 67000.0;
		ref20.design = "Smooth";
ref20.getInfo();*/

	}
}

