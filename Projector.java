class Projector{
	static boolean isPlug=true;
	static int currentStep;
	static int maxStep=6;
	static int minStep;
	
	public static void isOnOff(){
		if(isPlug==false){
			//isPlug=true;
			System.out.println(" Power off, trun on ");
			}
		else{
			System.out.println(" Power On ");
		}

}
	public static void zoomIn(){
			System.out.println("Steps Method started");

		if(isPlug==true){
			if(currentStep<maxStep){
				currentStep=currentStep+1;
				System.out.println(" Zoom In + "+currentStep);
				
			}
		}
		else{
			System.out.println(" Power off,please plug to swetch and trun on ");
		}
			
	}

	public static void zoomOut(){
		System.out.println("StepDown method started");
		if (isPlug=true){
			if(currentStep>minStep)
				currentStep=currentStep-1;
				System.out.println(" Zoom Out - "+currentStep);
		}else{
			System.out.println(" Power off,please plug to swetch and trun on ");
		}
			
	}
			
			
				


}	