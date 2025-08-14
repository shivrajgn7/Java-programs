public class HairClip {
	
	int clipId;
	String brand;
	double price;
	String color;
	String material;
	String size;
	HairClip(int clipId,String brand,double price,String color, String material,String size){
		this.clipId=clipId;
		this.price=price;
		this.color=color;
		this.material=material;
		this.size=size;
	}
	
	public void getInfo(){
		
		System.out.println("the hair clip id is " + clipId);
		System.out.println("the brand is " + brand);
		System.out.println("the price of hair clip is " + price);
		System.out.println("the color of hair clip is " + color);
		System.out.println("the material of hair clip is " + material);
		System.out.println("the size of hair clip is " + size);
		
	}
	
	
}