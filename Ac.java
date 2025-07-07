class Ac{

	static boolean powerOn;
	static int currentTemp;
	static int maxTemp=25;
	static int minTemp;

	public static void isOnOff(){
		if(powerOn==false)
			System.out.println(" Power of ,Please Turn on");
		else
		System.out.println("Power on");
	
	}

	public static void increseTemp(){
		System.out.println("+,Increse");
		if(powerOn=true){
			if(currentTemp<maxTemp){
				currentTemp=currentTemp+1;
			System.out.println("The current temprature is"+currentTemp);
			}
		}else
			System.out.println("Power of ,Please Turn on");
	
	}

	public static void decreseTemp(){
		System.out.println("- ,Decrese");
		if(powerOn=true){
			if(currentTemp>minTemp)
				currentTemp=currentTemp-1;
			System.out.println("The current temprature is"+currentTemp);
		}
		else
			System.out.println("Power of ,Please Turn on");

			
		
	}



}

	