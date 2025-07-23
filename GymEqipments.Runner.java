class GymEqipmentsRunner{

	public static void main(String[]fitness){
	
	GymEquipment gym1=new GymEquipment();
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
	
	}

}