class Page{

	int pageId=34;
	Article article;
	Page page=new Page();
	page.article=article;
	void getPage(){
	System.out.println("Page id is : "+pageId);
	this.article.getArticle();
	}

}