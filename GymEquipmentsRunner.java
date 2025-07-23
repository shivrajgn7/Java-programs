class GymEquipmentsRunner{

	public static void main(String[]fitness){
	
	GymEquipments gym1=new GymEquipments();
	gym1.gymId=67;
	gym1.gymName="Rock";
	gym1.isDumble=true;
	gym1. maxDumbleKG=45;
	gym1.isBarbells=true;
	gym1.typeBarbells=14;
	
	System.out.println("Gym Id is : "+gym1.gymId);
	System.out.println("Gym Name is : "+gym1.gymName);
	System.out.println("Gym have dumbles : "+gym1.isDumble);
	System.out.println("max dumble size: "+gym1.maxDumbleKG);
	System.out.println("gym have barbbeles: "+gym1.isBarbells);
	System.out.println("how many barbells are inn gym: "+gym1.typeBarbells);
	
	
	GymEquipments gym2=new GymEquipments();
	gym2.gymId=22;
	gym2.gymName="Monstar";
	gym2.isDumble=true;
	gym2. maxDumbleKG=35;
	gym2.isBarbells=false;
	gym2.typeBarbells=0;
	
	System.out.println("Gym Id is : "+gym2.gymId);
	System.out.println("Gym Name is : "+gym2.gymName);
	System.out.println("Gym have dumbles : "+gym2.isDumble);
	System.out.println("max dumble size: "+gym2.maxDumbleKG);
	System.out.println("gym have barbbeles: "+gym2.isBarbells);
	System.out.println("how many barbells are inn gym: "+gym2.typeBarbells);
	
	
	
	}

}