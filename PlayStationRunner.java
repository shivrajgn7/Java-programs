class PlayStationRunner{
	public static void main(String []jhg){
	String gameName[]={"God of War, "," Spider-Man:, "," Miles Morales, "," Horizon Forbidden, "," West The Last of Us Part II, "," Ghost of Tsushima, "," Uncharted 4, "," Gran Turismo 7, "," Bloodborne, "," Ratchet & Clank, "," Rift Apart, "," Final Fantasy VII Remake, "};

	PlayStation game=new PlayStation(32322,gameName,"White","v5",true);
	game.name=gameName;
	System.out.println(game.id+" "+game.color+" "   +game.version+" "+game.isPS5);
	
	game.getPlayStation();
	
	
	
	}
	
}