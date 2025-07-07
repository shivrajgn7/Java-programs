class Fan{
	static boolean powerOn=true;
	static int speed;
	static int maxSpeed=4;
	static int minSpeed;
	public static void isOnOff(){
		if(powerOn==false)
		System.out.println("Power off,please Turn on");
		else
		System.out.println("Power On");
		}
		
	public static void up(){
		if(powerOn==true){
			if(speed<maxSpeed)
				speed=speed+1;
			System.out.println("The  current speed is :"+speed);
		}
		else
			System.out.println("Power off,please Turn on");
	
	}
	
	public static void down(){
		if(powerOn=true){
			if(speed>minSpeed)
			speed=speed-1;
			System.out.println("The current speed is :"+speed);
		}
		else
			System.out.println("Power off,Please turn on");
	}


}