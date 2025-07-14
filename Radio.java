class Radio{
	static String sName;
	public static boolean onOff(boolean on,boolean net,String name){
		boolean isOn=false;
		if(on==true){
		isOn=true;
		System.out.println("The system is on: "+on);
		}else{
		System.out.println("The system is of: "+on);
		}if(net==true){
		System.out.println("Network connnected: "+net);
		}else{
		System.out.println("Network Disconnected: "+net);
		}
		if(name!=null){
			sName=name;
		
		System.out.println("The System name is:"+sName);
		}
		else{
		System.out.println("Give proper name");
		}
		return isOn;
	}
}
		
		