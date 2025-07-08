 class BuyingProduct{
	public static void product(String productName,String productColor,String productDes){
		System.out.println("Product Name: "+productName);
		System.out.println("Product Color: "+productColor);
		System.out.println("Product Description: "+productDes);
	
		BuyingCustomer.customer(productName,23000);
	}

}