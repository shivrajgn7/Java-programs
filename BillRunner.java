class BillRunner{
	public static void main(String[]currency){
	System.out.println("Main Started");
	
	Bill ref=new Bill;
	ref.billId=1;
	ref.billAmountWithTax=129.88;
	ref.planType="Monthly plan";
	ref.billIssueDate="12-05-2024";
	ref.paymentMode="Online";
	ref.billDueDate="12-04-2024";
	ref.isBillOverDue=false;
	ref.isBillPaid=true;
	
	ref.billId=2;
	
	System.out.println("The first bill id is : "+ref.billId);
	System.out.println("Aaount of tax: "+ref.billAmountWithTax);
	System.out.println("Plan type is : "+ref.planType);
	System.out.println("Bill issue date: "+ref.billIssueDate);
	System.out.println("Payment mode: "+ref.paymentMode);
	System.out.println("Bill Due date: "+ref.billDueDate);
	System.out.println("Bill over due: "+ref.billDueDate);
	System.out.println("Bill paid: "+ref.isBillPaid);
	
	Bill secoundBill= new Bill();
	secoundBill.billId=766;
	secoundBill.billIssueDate="14-06-2025";
	secoundBill.billAmountWithTax=32.32;
	secoundBill.planType="quartal month";
	secoundBill.isBillOverDue=false;
	secoundBill.paymentMode="Online";
	//secoundBill.isBillOverDue=false;
	secoundBill.isBillPaid=true;
	
	System.out.println("The Secound bill : "+secoundBill.billId);
	System.out.println("Bill Issue date : "+secoundBill.billIssueDate);
	System.out.println(" Bill with tax: "+secoundBill.billAmountWithTax);
	System.out.println(" Plan type: "+secoundBill.planType);
	System.out.println("Bill Over due: "+secoundBill.isBillOverDue);
	System.out.println("Payment mode: "+secoundBill.paymentMode);
	System.out.println("is Bill paid: "+secoundBill.isBillPaid);
	
	
	Bill thirdBill=new Bill();
	thirdBill.billId=987;
	thirdBill.paymentMode="Online";
	thirdBill.billDueDate="14-02-2024";
	thirdBill.isBillOverDue=false;
	thirdBill.billAmountWithTax=100.45;
	thirdBill.planType="Monthly plan";
	thirdBill.billIssueDate="23-06-2024";
	thirdBill.isBillPaid=false;
	
		System.out.println("The Third bill : "+thirdBill.billId);
		System.out.println("Payment mode: "+thirdBill.paymentMode);
	System.out.println("Bill Due date: "+thirdBill.billDueDate);
	System.out.println("Bill over due: "+thirdBill.billDueDate);
	System.out.println("Aaount of tax: "+thirdBill.billAmountWithTax);
	System.out.println("Plan type is : "+thirdBill.planType);
	System.out.println("Bill issue date: "+thirdBill.billIssueDate);
	System.out.println("Bill paid: "+thirdBill.isBillPaid);
	
	Bill fourthBill=new  Bill();
	fourthBill.billId=422;
	fourthBill.paymentMode="ofline";
	fourthBill.billDueDate="31-04-2022";
	fourthBill.billAmountWithTax=34.33;
	fourthBill.planType="quartal plan";
	fourthBill.billIssueDate="23-07-2023";
	fourthBill.isBillPaid=true;
	
	System.out.println("The Fourth bill : "+fourthBill.billId);
	System.out.println("Payment mode: "+fourthBill.paymentMode);
	System.out.println("Bill Due date: "+fourthBill.billDueDate);
	System.out.println("Bill over due: "+fourthBill.billDueDate);
	System.out.println("Aaount of tax: "+fourthBill.billAmountWithTax);
	System.out.println("Plan type is : "+fourthBill.planType);
	System.out.println("Bill issue date: "+fourthBill.billIssueDate);
	System.out.println("Bill paid: "+fourthBill.isBillPaid);
	
	Bill fiveth=new Bill();
	fiveth.billId=32;
	fiveth.paymentMode="online";
	fiveth.billDueDate="12-04-2023";
	fiveth.billAmountWithTax=43.23;
	fiveth.planType="monthly plan";
	fiveth.billIssueDate="13-05-2024";
	fiveth.isBillPaid=true;
	
	System.out.println("The Fivfth bill : "+fiveth.billId);
	System.out.println("Payment mode: "+fiveth.paymentMode);
	System.out.println("Bill Due date: "+fiveth.billDueDate);
	System.out.println("Bill over due: "+fiveth.billDueDate);
	System.out.println("Aaount of tax: "+fiveth.billAmountWithTax);
	System.out.println("Plan type is : "+fiveth.planType);
	System.out.println("Bill issue date: "+fiveth.billIssueDate);
	System.out.println("Bill paid: "+fiveth.isBillPaid);
	
	Bill sixteh=new Bill();
	sixteh.billId=533;
	sixteh.paymentMode="ofline";
	sixteh.billDueDate="21-03-2025";
	sixteh.billAmountWithTax=765.33;
	sixteh.planType="yearly plan";
	sixteh.billIssueDate="12-04-2022";
	sixteh.isBillPaid=true;
	
	System.out.println("The Sixth bill : "+sixteh.billId);
		System.out.println("Payment mode: "+sixteh.paymentMode);
	System.out.println("Bill Due date: "+sixteh.billDueDate);
	System.out.println("Bill over due: "+sixteh.billDueDate);
	System.out.println("Aaount of tax: "+sixteh.billAmountWithTax);
	System.out.println("Plan type is : "+sixteh.planType);
	System.out.println("Bill issue date: "+sixteh.billIssueDate);
	System.out.println("Bill paid: "+sixteh.isBillPaid);
	
	

	
	
	
	
	System.out.println("Main Ended");
	
	}

}