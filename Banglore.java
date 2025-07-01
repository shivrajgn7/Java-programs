class Banglore{
	/*static String street1="MG Road ";
	static String street2="Koramangala ";
	static String street3="Indiranagar ";
	static String street4="Whitefield ";
	static String street5="Jayanagar ";
	static String street6="Banashankari ";
	static String street7="Rajajinagar ";
	static String street8="Hebbal ";
	static String street9="Marathahalli ";
	static String street10="BTM Layout ";*/
	
	public static void main(String[]area){
	
	System.out.println("Main Started");
	
	String street1="MG Road ";
	String street2="Koramangala ";
	String street3="Indiranagar ";
	String street4="Whitefield ";
	String street5="Jayanagar ";
	String street6="Banashankari ";
	String street7="Rajajinagar ";
	String street8="Hebbal ";
	String street9="Marathahalli ";
	String street10="BTM Layout ";
	
	
	String bangArea[]={street1,street2,street3,street4,street5,street6,street7,street8,street9,street10};
		String areaName[]={"MG Road","Koramangala","Indiranagar","Whitefield","Jayanagar","Banashankari ","Rajajinagar","Hebbal","Marathahalli","BTM Layout"};
		//System.out.println("Area Names ; "+areaName[1]+" "+areaName[2]+" "+areaName[3]+" "+areaName[4]+" "+areaName[5]+" "+areaName[6]+" "+areaName[7]+" "+areaName[8]+" "+areaName[9]);
		for (String aarea:bangArea){
			System.out.println(aarea);
		}
	}
}