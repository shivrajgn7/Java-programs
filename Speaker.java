class Speaker{

	static boolean isConnnected;
	static int currentVolume=2;
	static int maxVolume=7;
	static int minVolume;
	public static void onOrOff(){
		if (isConnnected==false){
			isConnnected=true;
		System.out.println(" device is turned off");
	}else{
		isConnnected=false;
		System.out.println("Device is turned on");
	}
   }
		
		
		
		
		
	public static void increaseVolume(){
		System.out.println("volme started");
		if(isConnnected==true){
			if(currentVolume< maxVolume){
			currentVolume=currentVolume+1;
			System.out.println("Current volume is"+currentVolume);
			}else{
			System.out.println("Max volume reached");
			}
		}else{
		System.out.println("Turn on the device");
		
		}
	}
	
	public static void decreaseVolme(){
		if(isConnnected == true){
			if (currentVolume>minVolume){
				currentVolume=currentVolume - 1;
				System.out.println("The current volume is"+currentVolume);
			}else{
				System.out.println("Minimum volume is reached"+currentVolume);
				
		}
		}else{
			System.out.println("Turn on the device");
		}
	}
	
}
