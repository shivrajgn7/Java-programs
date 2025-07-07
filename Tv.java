class Tv{
	static boolean powerOn=true;
	static int curVolume;
	static int maxVol=9;
	static int minVol;
	public static void isOnOff(){
		if(powerOn==false)
		System.out.println("Power off,please Turn on");
		else
		System.out.println("Power On");
		}
		
	public static void up(){
		if(powerOn==true){
			if(curVolume<maxVol)
				curVolume=curVolume+1;
			System.out.println("The  current speed is + :"+curVolume);
		}
		else
			System.out.println("Power off,please Turn on");
	
	}
	
	public static void down(){
		if(powerOn=true){
			if(curVolume>minVol)
			curVolume=curVolume-1;
			System.out.println("The current speed is - :"+curVolume);
		}
		else
			System.out.println("Power off,Please turn on");
	}


}