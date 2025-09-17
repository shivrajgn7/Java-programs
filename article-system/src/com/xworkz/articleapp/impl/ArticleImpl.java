package com.xworkz.articleapp.impl;

import com.xworkz.articleapp.article.Article;

public class ArticleImpl implements Article {

    @Override
    public void draft() { System.out.println("Article drafted"); }
    @Override
    public void edit() { System.out.println("Article edited"); }
    @Override
    public void publish() { System.out.println("Article published"); }
}
