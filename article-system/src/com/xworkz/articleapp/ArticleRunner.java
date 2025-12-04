package com.xworkz.articleapp;

import com.xworkz.articleapp.article.Article;
import com.xworkz.articleapp.impl.ArticleImpl;

public class ArticleRunner {
    public static void main(String[] args) {
        Article article = new ArticleImpl();
        article.draft();
        article.edit();
        article.publish();
    }
}
