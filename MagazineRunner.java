class MagazineRunner{

	public static void main(String[]learn){
	
	Article article=new Article();
	
	Page page=new Page();
	page.article=article;
	
	Magazine magazine=new Magazine();
	magazine.page=page;
	magazine.getMagzine();
	
	
	}


}