class CountryCode{
	public static int countyCode(String cName){
		int cCode=0;
		
		if(cName=="India"){
			cCode=91;
			}
		else if(cName=="Australia"){
			cCode=61;
			}
		else if(cName=="SriLanka"){
			cCode=94;
			}
		else if(cName=="America"){
			cCode=1;
			}
		else if(cName=="Afghanistan"){
			cCode=93;
		}
		else if(cName=="Albania"){
			cCode=355;
		}
		else if(cName=="Algeria"){
			cCode=213;
		}
		else if(cName=="American samoa"){
			cCode=1684;
		}
		else if(cName=="Bangladesh"){
			cCode=880;
		}
		else if(cName=="Beninin"){
			cCode=229;
		}
		else if(cName=="Brazil"){
			cCode=55 ;
		}
		else if(cName=="Cambodia"){
			cCode=885;
		}
		else if(cName=="Canada"){
			cCode=1;
		}
		else if(cName=="Chad"){
			cCode=236;
		}
		else if(cName=="China"){
			cCode=86;
		}else if(cName=="Denmark"){
			cCode= 45;
		}
		else if(cName=="East Timor"){
			cCode=670 ;
		}
		else if(cName=="Egypt"){
			cCode=20;
		}
		else if(cName=="Eritrea"){
			cCode=29;
		}
		else if(cName=="Finland"){
			cCode=358;
		}
		else if(cName=="France"){
			cCode=33 ;
		}
		else if(cName=="Greenland"){
			cCode=299;
		}
		else if(cName=="Germany"){
			cCode=49;
		}
		else if(cName=="Iran"){
			cCode=98;
		}
		else if(cName=="Italy"){
			cCode= 39;
		}
			
	
			else{
			System.out.println("Country code not found");
			}
			return cCode;
	
	}
}