class WashingMachine{
	static boolean isPlug=true;
	static int currentStep;
	static int maxStep=3;
	static int minStep;
	
	public static void isOnOff(){
		if(isPlug==false){
			//isPlug=true;
			System.out.println(" Power off,please plug to switch and trun on ");
			}
		else{
			System.out.println(" Power On ");
		}

}
	public static void stepUp(){
			if(isPlug==true){
			if(currentStep<maxStep){
				currentStep=currentStep+1;
				System.out.println("Curren step is + "+currentStep);
				
			}
		}
		else{
			System.out.println(" Power off,please plug to swetch and truned on ");
		}
			
	}

	public static void stepDown(){
		if (isPlug=true){
			if(currentStep>minStep)
				currentStep=currentStep-1;
				System.out.println("The currentStep is - "+currentStep);
		}else{
			System.out.println(" Power off,please plug to swetch and truned on ");
		}
			
	}
			
			
				


}	