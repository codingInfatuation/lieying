package org.lieying.dao;

import org.lieying.bean.Article;

import java.util.List;

public interface ArticleMapper {
    public List<Article> selectArticlesByJobHunterId(int jobHunterId);
    public Article selectArticleById(int articleId);
}

