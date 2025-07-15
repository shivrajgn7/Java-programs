class Zomato{
	static double price;
	public static double food(String fName){
		if(fName=="Burger"){
		price=99.99;
		return price;
		}
			else if(fName=="Biryani"){
			price=265.97;
			return price;
			}
			else if(fName=="Pizza"){
			price=231.87;
			return price;
			
			
			}
			else if(fName=="Pasta"){
			price=87.98;
			return price;
			}
			else if(fName=="Kebab"){
			price=130.73;
			return price;
			}
			else if(fName=="Pastry"){
			price=87.45;
			return price;
			}
			else if(fName=="NorthIndia"){
			price=345.65;
			return price;
			}
			else if(fName=="Parotta"){
			price=76.76 ;
			return price;
			
			}
			else if(fName=="Salad"){
			price=90.23;
			return price;
			}
			else if(fName=="Chinese"){
			price=219.34;
			return price;
			}
			else if(fName=="Rools"){
			price= 76.34;
			return price;
			}
			else if(fName=="Noodles"){
			price=100.34;
			return price;

			}
			else if(fName=="Dosa"){
			price=89.67;
			
			}
			else if(fName=="Shavarma"){
			price=90.89;
			}
			else if(fName=="VegMomo"){
			price=76.63;
			}
			else if(fName=="Idli"){
			price=78.87;
			}
			else if(fName=="Paratha"){
			price=40.00;
			}
			else if(fName=="IceCream"){
			price=340.87;
			}
			else if(fName=="papad"){
			price=98.78;
			}
			else if(fName=="Rice"){
			price=40;
			}
			else if(fName=="Puri"){
			price=68.45;
	return price;		
		}
			else if(fName=="Crud Rice"){
			price=130.89 ;
			return price;
			}
			else{
			System.out.println("The system is not found");
			}
			return price;
		
	
	
	}
	public static double food(String fName,int quantity){
		double priceVal=0.00;
		if(fName=="Burger"){
		price=99.99*quantity;
		return price;
		}
			else if(fName=="Biryani"){
			price=265.97*quantity;
			return price;
			}
			else if(fName=="Pizza"){
			price=231.87*price;
			return price;
			
			
			}
			else if(fName=="Pasta"){
			price=87.98*quantity;
			return price;
			}
			else if(fName=="Kebab"){
			price=130.73*quantity;
			return price;
			}
			else if(fName=="Pastry"){
			price=87.45*quantity;
			return price;
			}
			else if(fName=="NorthIndia"){
			price=345.65*quantity;
			return price;
			}
			else if(fName=="Parotta"){
			price=76.76*quantity ;
			return price;
			
			}
			else if(fName=="Salad"){
			price=90.23*quantity;
			return price;
			}
			else if(fName=="Chinese"){
			price=219.34;
			return price;
			}
			else if(fName=="Rools"){
			price= 76.34*quantity;
			return price;
			}
			else if(fName=="Noodles"){
			price=100.34*quantity;
			return price;

			}
			else if(fName=="Dosa"){
			price=89.67*quantity;
			return price;
			
			}
			else if(fName=="Shavarma"){
			price=90.89*quantity;
			return price;
			}
			else if(fName=="VegMomo"){
			price=76.63*quantity;
			return price;
			}
			else if(fName=="Idli"){
			price=78.87*quantity;
			return price;
			}
			else if(fName=="Paratha"){
			price=40.00*quantity;
			return price;
			}
			else if(fName=="IceCream"){
			price=340.87*quantity;
			return price;
			}
			else if(fName=="papad"){
			price=98.78*quantity;
			return price;
			}
			else if(fName=="Rice"){
			price=40*quantity;
			return price;
			}
			else if(fName=="Puri"){
			price=68.45*quantity;
			return price;		
			}
			else if(fName=="Crud Rice"){
			price=130.89 *quantity;
			return price;
			}
			else{
			System.out.println("The system is not found");
			}
			return priceVal;
		
	
	
	}
}