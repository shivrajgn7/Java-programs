class Cloths{
static String brand;

	public static String clothsVal(int but,String bName,int size,String quality){
		if(but!=0){
			System.out.println("Button are: "+but);
			}
			if(bName!=null){
			brand=bName;
			System.out.println("The brannd name is: "+brand);
			}
			if(size!=0){
			System.out.println("the size of the cloths is: "+size);
			}
			if(quality!=null){
				System.out.println("The quality of cloths: "+quality);
				}
			return brand;
			}
		}