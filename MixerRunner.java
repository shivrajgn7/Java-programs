class MixerRunner{
	public static void main (String [] grainder){
	
		Mixer.isOnOff();
		System.out.println("Method started");
		
		Mixer.stepsUp();
		Mixer.stepsUp();
		Mixer.stepsUp();
		Mixer.stepsUp();
		Mixer.stepsUp();//if we invoke more than four times it will not taken because we taken maxStep =4
		
		
		System.out.println("Steps Method ended");
		
		Mixer.stepDown();
		Mixer.stepDown();
		Mixer.stepDown();
		Mixer.stepDown();
		Mixer.stepDown();// if we invoke more than 4 it shows min val of zero
		Mixer.stepDown();
		
		
		System.out.println("Method Ended");
			
	}
}
