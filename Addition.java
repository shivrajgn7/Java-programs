class Addition{

	public static void main(String [] add){
		
		add(43,23);
		add(34,222);
		add (34,23);
		
		//System.out.println(total);
		
	
	}
	
	public static void add(int num1,int num2){
	int total=num1+num2;
	int sub=num1-num2;
	int mul=num1*num2;
	int div =num1/num2;
	int mod=num1%num2;
	
	int airthmentic[]={total,sub,div,mul,mod};
	for (int aa:airthmentic){
		System.out.println(aa);
	}
	
	System.out.println("addition:"+total);
	System.out.println("Substraction :"+sub);
	System.out.println("Division:"+div);
	System.out.println("Multiplication:"+mul);
	System.out.println("Modules:"+mod);
	}
}