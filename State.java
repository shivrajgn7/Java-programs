class State{
	
	String noState[];
	String oneState;
	State(String noState[],String oneState){
		this.noState=noState;
		this.oneState=oneState;
	}
	City city;
	
	void getState(){
	System.out.println("number of states : "+noState);
	System.out.println("Single stat name :"+oneState);
	for(String ss:noState)
		System.out.println(ss);
	this.city.getCity();
	
	}
	


}