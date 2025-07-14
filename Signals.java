class Signals{
public static void siVal(boolean amplitude,boolean frequency,boolean analog,boolean power){
	boolean powerValid=false;
	if(amplitude==true){
	
	System.out.println("Amplitude: "+amplitude);
	}else{
	System.out.println("Amplitude not connected");
	
	}
	if(frequency==true){
	System.out.println("Frequency: "+frequency);
	}else{
	System.out.println("Frequency not connnected ");
	}
	if(power==true){
		powerValid=true;
		System.out.println("Power: "+power);
		}else{
			System.out.println("Power not connected ");
		}
	//return powerValid;

		



	


}

}