class Cooler{
	static boolean powerOn=true;
	static int speed;
	static int maxSpeed=5;
	static int minSpeed;
	public static void isOnOff(){
		if(powerOn==false)
		System.out.println("Power off,please Turn on");
		else
		System.out.println("Power On");
		}
		
	public static int forward(){
		if(powerOn==true){
			if(speed<maxSpeed){
				speed=speed+1;
			System.out.println("The  current speed of cooler is + :"+speed);
			if(speed>maxSpeed){
				return speed;
			}
			}
		}
		else{
			System.out.println("Power off,please Turn on");
		}
		return  speed;
	
	}
	
	public static int backward(){
		if(powerOn=true){
			if(speed>minSpeed){
			speed=speed-1;
			System.out.println("The current speed of cooler  is - :"+speed);
		    if(speed==minSpeed){
				
			}
			}
		}
		else{
			System.out.println("Power off,Please turn on");
	}
	return speed;
	}
	


}